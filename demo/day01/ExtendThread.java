package day01;

/**
 * @author yusx
 * @date 2020/11/22 3:36 下午
 */
// 创建多线程的方法 1、继承Thread类 2、重写run()方法 3、调用start()方法
public class ExtendThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("createdThread:" + i);
        }
    }
}
