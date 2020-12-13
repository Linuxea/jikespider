package com.linuxea.spider.util;

import com.linuxea.spider.constant.SpiderConstant;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author linuxea
 * @date 2019/7/31 19:29
 */
@Slf4j
public class FileSaveUtil {

    private static Path courseFilePath;
    private static Path topicFilePath;
    private static Path articleFilePath;

    static {
        try {
            courseFilePath = Paths.get(SpiderConstant.class.getResource("/course").toURI());
            topicFilePath = Paths.get(SpiderConstant.class.getResource("/topic").toURI());
            articleFilePath = Paths.get(SpiderConstant.class.getResource("/article").toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public static void saveCourse(String val) {
        try {
            Files.write(courseFilePath, (val + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            log.warn("保存失败");
        }
    }

    public static void saveTopic(String val) {
        try {
            Files.write(topicFilePath, (val + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            log.warn("保存失败");
        }
    }

    public static void saveArticle(String val) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newBufferedWriter(articleFilePath, StandardOpenOption.APPEND);
            bufferedWriter.write(val);
            bufferedWriter.flush();
        } catch (IOException e) {
            log.warn("保存失败");
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
