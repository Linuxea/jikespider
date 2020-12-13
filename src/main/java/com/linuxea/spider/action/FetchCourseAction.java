package com.linuxea.spider.action;

import com.linuxea.spider.model.CourseResponse;
import com.linuxea.spider.util.JsonUtil;
import com.linuxea.spider.util.OkHttpUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

/**
 * @author linuxea
 * @date 2019/7/31 14:17
 */
@Slf4j
public class FetchCourseAction extends AbstractFetchAction<Void, CourseResponse> {

    @Override
    public CourseResponse fetch(Void vod) {
        try {
            final Response execute =
                    OkHttpUtil.getClient()
                            .newCall(
                                    OkHttpUtil.buildCommonRequest()
                                            .url("https://time.geekbang.org/serv/v1/my/products/all")
                                            .build())
                            .execute();
            return JsonUtil.parseToClass(
                    Objects.requireNonNull(execute.body()).string(), CourseResponse.class);
        } catch (IOException e) {
            log.error("获取远程数据异常", e);
        }
        return null;
    }
}
