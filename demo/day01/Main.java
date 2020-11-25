package day01;

/**
 * @author yusx
 * @date 2020/11/22 3:45 下午
 */
public class Main {
    public static void main(String[] args) {
        ExtendThread t1 = new ExtendThread();
        t1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main thread:" + i);
        }
        // 线程不一定立即执行，由cpu调度执行
    }
}
