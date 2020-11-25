package day02;

/**
 * @author yusx
 * @date 2020/11/25 3:57 下午
 */
// 创建线程的第二种方式：1、实现Runnable接口 2、重写run方法 3、创建Runnable实现类 丢入Thread 执行start方法
public class ImplRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("实现了Runnable接口" + i);
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new ImplRunnable();
        new Thread(runnable).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main " + i);
        }
    }

    /**
     * 总结：避免单继承的局限性 ，推荐使用，方便同一个对象被多个线程使用
     */
}
