package com.linuxea.spider.util;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;

import java.io.IOException;

/**
 * @author linuxea
 * @date 2019/7/31 14:45
 */
@Slf4j
public class JsonUtil {

  public static <T> T parseToClass(String jsonString, Class<T> tClass) {
    try {
      ObjectMapper mapper =
          new ObjectMapper()
              .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
              .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
      return mapper.readValue(jsonString, tClass);
    } catch (IOException e) {
      e.printStackTrace();
    }
    log.warn("解析 json 字符串失败");
    return null;
  }

  public static String parseToString(Object o) {
    try {
      ObjectMapper mapper =
          new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
      mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
      return mapper.writeValueAsString(o);
    } catch (IOException e) {
      log.error("解决字符串到对象异常", e);
    }
    return Strings.EMPTY;
  }
}
