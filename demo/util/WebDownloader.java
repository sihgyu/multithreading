package util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author yusx
 * @date 2020/11/25 3:34 下午
 */
// 下载工具
public class WebDownloader {
    public void downloader(String url, String fileName) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("io 异常 downloader");
        }

    }
}
