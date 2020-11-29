package demo04;

/**
 * @author sihgyu
 * @date 2020/11/29 下午8:01
 */
// 静态代理
public class StaticProxy {
    /**
     * 1、代理对象和真实对象实现同一个接口 Marry
     * 2、代理对象要代理真实角色，调用真实对象的方法
     * <p>
     * 优点：
     * 代理对象可实现很多真实对象做不了的事
     * 真实对象专注做自己的事情
     */
    public static void main(String[] args) {
        /**
         * 对比runnable 可以发现也是通过静态代理实现的
         * 1、Thread实现了Runnable接口
         * 2、Thread与自己定义的实现类都有run()方法
         */
        new Thread(() -> System.out.println("lambda")).start();
        new WeddingCompany(new People()).happyMarry();
    }
}
