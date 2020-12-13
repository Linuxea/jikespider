package com.linuxea.spider.action;

import com.linuxea.spider.model.TopicRequest;
import com.linuxea.spider.model.TopicResponse;
import com.linuxea.spider.util.JsonUtil;
import com.linuxea.spider.util.OkHttpUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

/**
 * @author linuxea
 * @date 2019/7/31 14:17
 */
@Slf4j
public class FetchTopicAction extends AbstractFetchAction<TopicRequest, TopicResponse> {

    @Override
    public TopicResponse fetch(TopicRequest topicRequest) {
        try {
            MediaType mediaType = MediaType.get("text/plain");
            final String string = JsonUtil.parseToString(topicRequest);
            RequestBody body = RequestBody.create(string.getBytes(), mediaType);
            final Request build =
                    OkHttpUtil.buildCommonRequest()
                            .url("https://time.geekbang.org/serv/v1/column/articles")
                            .post(body)
                            .build();
            final Response execute = OkHttpUtil.getClient().newCall(build).execute();
            if (execute.isSuccessful()) {
                return JsonUtil.parseToClass(
                        Objects.requireNonNull(execute.body()).string(), TopicResponse.class);
            } else {
                log.warn(
                        "请求失败 {}", JsonUtil.parseToString(Objects.requireNonNull(execute.body()).string()));
            }
        } catch (IOException e) {
            log.error("与远程连接异常", e);
        }
        return null;
    }
}
