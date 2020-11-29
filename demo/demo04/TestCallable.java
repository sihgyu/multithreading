package demo04;

/**
 * @author sihgyu
 * @date 2020/11/29 下午7:44
 */

import util.WebDownloader;

import java.util.concurrent.*;

/**
 * 线程创建方式三：实现callable接口
 */
public class TestCallable implements Callable<Boolean> {
    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public Boolean call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名为：" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://wx1.sinaimg.cn/large/0024cZx9ly1gl1av2dj95j60f408in4602.jpg", "图片1.jpg");
        TestCallable t2 = new TestCallable("https://wx3.sinaimg.cn/large/0024cZx9ly1gl17e6nnwxj60f408ijzk02.jpg", "图片2.jpg");
        TestCallable t3 = new TestCallable("https://wx1.sinaimg.cn/large/0024cZx9ly1gl0ghv04i1j60f408i0z102.jpg", "图片3.jpg");

        // 创建执行服务
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Boolean> f1 = executorService.submit(t1);
        Future<Boolean> f2 = executorService.submit(t2);
        Future<Boolean> f3 = executorService.submit(t3);

        boolean r1 = f1.get();
        boolean r2 = f2.get();
        boolean r3 = f3.get();
        System.out.println("r1" + r1 + "r2" + r2 + "r3" + r3);
        executorService.shutdownNow();

    }

}
