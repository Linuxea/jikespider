package com.linuxea.spider.model;

import lombok.Builder;

/**
 * @author linuxea
 * @date 2019/7/31 15:10
 */
@Builder
public class TopicRequest {

  private int cid;
  @Builder.Default private int size = 100;
  @Builder.Default private int prev = 0;
  @Builder.Default private String order = "earliest";
  @Builder.Default private boolean sample = false;
}
