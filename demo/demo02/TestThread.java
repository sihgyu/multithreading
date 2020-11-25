package demo02;

import util.WebDownloader;

/**
 * @author yusx
 * @date 2020/11/25 4:04 下午
 */
// 通过runnable方式实现下载图片
public class TestThread implements Runnable {
    private String url = ""; // 网络图片的url
    private String name = ""; // 保存文件名称

    public TestThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了：" + name);
    }

    public static void main(String[] args) {
        Runnable r1 = new TestThread("https://wx1.sinaimg.cn/large/0024cZx9ly1gl1av2dj95j60f408in4602.jpg", "图片1.jpg");
        Runnable r2 = new TestThread("https://wx3.sinaimg.cn/large/0024cZx9ly1gl17e6nnwxj60f408ijzk02.jpg", "图片2.jpg");
        Runnable r3 = new TestThread("https://wx1.sinaimg.cn/large/0024cZx9ly1gl0ghv04i1j60f408i0z102.jpg", "图片3.jpg");
        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
    }

}
