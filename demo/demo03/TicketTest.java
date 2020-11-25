package demo03;

/**
 * @author yusx
 * @date 2020/11/25 3:57 下午
 */
//多个线程 同时操作一个对象
public class TicketTest implements Runnable {

    // 票数
    private int ticketNum = 10;

    public void run() {
        while (ticketNum > 0) {
            try {
                Thread.sleep(200);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("sleep error");
            }

            System.out.println(Thread.currentThread().getName() + "-->当前购买了第--->" + ticketNum-- + "票");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new TicketTest();

        new Thread(runnable,"1").start();
        new Thread(runnable,"2").start();
        new Thread(runnable,"3").start();
        new Thread(runnable,"4").start();
        new Thread(runnable,"5").start();
        /**
         * 多个线程操作同一个资源的时候 出现了问题 拿到了重复的票
         * 在学习并发的时候会解决这个问题
         */
    }

}
