package demo04.staticProxy;

import demo04.staticProxy.Marry;

/**
 * @author sihgyu
 * @date 2020/11/29 下午8:02
 */
// 真正结婚的对象
public class People implements Marry {
    public void happyMarry() {
        System.out.println("结婚了！！");
    }
}
