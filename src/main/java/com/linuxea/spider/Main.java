package com.linuxea.spider;

import com.linuxea.spider.action.AbstractFetchAction;
import com.linuxea.spider.action.FetchArticleAction;
import com.linuxea.spider.action.FetchCourseAction;
import com.linuxea.spider.action.FetchTopicAction;
import com.linuxea.spider.model.*;
import com.linuxea.spider.util.FileSaveUtil;
import com.linuxea.spider.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author linuxea
 * @date 2019/7/31 14:08
 */
@Slf4j
public class Main {

  public static void main(String[] args) {
    AbstractFetchAction<Void, CourseResponse> abstractFetchAction = new FetchCourseAction();
    AbstractFetchAction<TopicRequest, TopicResponse> fetchPageAction = new FetchTopicAction();
    AbstractFetchAction<ArticleRequest, ArticleResponse> fetchArticleAction =
        new FetchArticleAction();
    final CourseResponse action = abstractFetchAction.fetch(null);
    FileSaveUtil.saveCourse(Objects.requireNonNull(JsonUtil.parseToString(action)));
    // 目前只获取专栏的内容
    action.getData().stream()
        .filter(x -> "专栏".equals(x.getTitle()))
        .collect(Collectors.toList())
        .forEach(
            x -> {
              final List<CourseResponse.DataEntity.ListEntity> list = x.getList();
              list.forEach(
                  y -> {
                    final CourseResponse.DataEntity.ListEntity.ExtraEntity extra = y.getExtra();
                    // 文章 id
                    final int columnId = extra.getColumn_id();
                    final TopicResponse topicResponse =
                        fetchPageAction.fetch(TopicRequest.builder().cid(columnId).build());
                    FileSaveUtil.saveTopic(
                        Objects.requireNonNull(JsonUtil.parseToString(topicResponse)));
                    topicResponse
                        .getData()
                        .getList()
                        .forEach(
                            z -> {
                              final ArticleRequest articleRequest = new ArticleRequest();
                              articleRequest.setId(String.valueOf(z.getId()));
                              articleRequest.setInclude_neighbors(true);
                              final ArticleResponse articleResponse =
                                  fetchArticleAction.fetch(articleRequest);
                              FileSaveUtil.saveArticle(JsonUtil.parseToString(articleResponse));
                              try {
                                TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(5, 10));
                                log.info("线程休息中");
                              } catch (InterruptedException e) {
                                log.warn("异常", e);
                              }
                            });
                  });
            });
  }
}
