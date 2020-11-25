package day01;

import util.WebDownloader;

/**
 * @author yusx
 * @date 2020/11/25 3:33 下午
 */
// 练习使用Thread实现多线程同步下载图片
public class TestThread extends Thread {
    private String url = ""; // 网络图片的url
    private String name = ""; // 保存文件名称

    public TestThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了："+ name);
    }

    public static void main(String[] args) {
        TestThread t1 = new TestThread("https://wx1.sinaimg.cn/large/0024cZx9ly1gl1av2dj95j60f408in4602.jpg", "图片1.jpg");
        TestThread t2 = new TestThread("https://wx3.sinaimg.cn/large/0024cZx9ly1gl17e6nnwxj60f408ijzk02.jpg", "图片2.jpg");
        TestThread t3 = new TestThread("https://wx1.sinaimg.cn/large/0024cZx9ly1gl0ghv04i1j60f408i0z102.jpg", "图片3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}
