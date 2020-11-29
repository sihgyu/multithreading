package demo03;

/**
 * @author sihgyu
 * @date 2020/11/29 下午7:33
 */
// 龟兔赛跑
public class Race implements Runnable {

    private static String winner;

    @lombok.SneakyThrows
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if ("兔子".equals(Thread.currentThread().getName()) & i / 2 == 0) {
                // 模拟兔子睡觉
                Thread.sleep(2);
            }
            boolean flag = gameOver(i);
            if (flag) {
                //比赛结束 停止程序
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }

    public boolean gameOver(int steps) {
        // 存在胜利者 返回
        if (null != winner) {
            return true;
        }

        if (steps == 100) {
            winner = Thread.currentThread().getName();
            System.out.println("winner is " + winner);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}
