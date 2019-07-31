package com.linuxea.spider.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linuxea
 * @date 2019/7/31 18:20
 */
@NoArgsConstructor
@Data
public class ArticleRequest {

  private String id;

  private boolean include_neighbors;
}
