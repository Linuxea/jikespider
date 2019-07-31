package com.linuxea.spider.action;

/**
 * @author linuxea
 * @date 2019/7/31 14:16
 */
public abstract class AbstractFetchAction<RE, RT> {

  /**
   * 定义执行操作
   *
   * @param request 请求数据
   * @return 返回自定义对象
   */
  public abstract RT fetch(RE request);
}
