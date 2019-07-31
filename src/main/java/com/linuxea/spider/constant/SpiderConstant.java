package com.linuxea.spider.constant;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author linuxea
 * @date 2019/7/31 14:19
 */
@Slf4j
public class SpiderConstant {

  public static final String REFER = "https://time.geekbang.org";
  public static final String UA =
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36";
  public static String COOKIE;

  static {
    try {
      COOKIE =
          Files.readAllLines(Paths.get(SpiderConstant.class.getResource("/cookie").toURI()))
              .stream()
              .findFirst()
              .orElseThrow(() -> new NullPointerException("没有配置 cookie 值 "));
    } catch (IOException e) {
      log.warn("初始化 cookie 值失败", e);
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }
}
