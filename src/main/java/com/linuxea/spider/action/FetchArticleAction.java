package com.linuxea.spider.action;

import com.linuxea.spider.model.ArticleRequest;
import com.linuxea.spider.model.ArticleResponse;
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
public class FetchArticleAction extends AbstractFetchAction<ArticleRequest, ArticleResponse> {

  @Override
  public ArticleResponse fetch(ArticleRequest articleRequest) {
    try {
      MediaType mediaType = MediaType.get("text/plain");
      final String string = JsonUtil.parseToString(articleRequest);
      RequestBody body = RequestBody.create(Objects.requireNonNull(string).getBytes(), mediaType);
      final Request build =
          OkHttpUtil.buildCommonRequest()
              .url("https://time.geekbang.org/serv/v1/article")
              .post(body)
              .build();
      final Response execute = OkHttpUtil.getClient().newCall(build).execute();
      if (execute.isSuccessful()) {
        return JsonUtil.parseToClass(
            Objects.requireNonNull(execute.body()).string(), ArticleResponse.class);
      } else {
        log.warn(
            "请求失败 {}", JsonUtil.parseToString(Objects.requireNonNull(execute.body()).string()));
      }
    } catch (IOException e) {
      log.error("与远程连接异常", e);
    }
    log.warn("请求失败");
    return null;
  }
}
