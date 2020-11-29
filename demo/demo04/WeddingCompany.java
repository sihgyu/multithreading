package demo04;

/**
 * @author sihgyu
 * @date 2020/11/29 下午8:03
 */
// 婚庆公司 代理角色-- 帮助people结婚
public class WeddingCompany implements Marry {

    // 真实对象，通过婚庆公司代理
    private final Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    public void happyMarry() {
        before();
        this.target.happyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚后收拾现场");
    }

    private void before() {
        System.out.println("婚庆公司布置现场");
    }
}
