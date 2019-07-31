package com.linuxea.spider.util;

import com.linuxea.spider.constant.SpiderConstant;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @author linuxea
 * @date 2019/7/31 14:30
 */
@Slf4j
public class OkHttpUtil {

  public static Request.Builder buildCommonRequest() {
    return new Request.Builder()
        .addHeader("Cookie", SpiderConstant.COOKIE)
        .addHeader("Origin", SpiderConstant.REFER)
        .addHeader("User-Agent", SpiderConstant.UA)
        .addHeader("Accept", "*/*")
        .addHeader("Cache-Control", "no-cache")
        .addHeader("Host", "time.geekbang.org")
        .addHeader("Accept-Encoding", "gzip, deflate")
        .addHeader("Connection", "keep-alive");
  }

  public static OkHttpClient getClient() {
    HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
    logging.level(HttpLoggingInterceptor.Level.BODY);
    return new OkHttpClient.Builder().addInterceptor(logging).build();
  }
}
