package demo04;

/**
 * @author sihgyu
 * @date 2020/11/29 下午8:21
 */

/**
 * 函数式接口
 * 任何接口如果只包含唯一一个抽象方法，那么他就是一个函数式接口
 * 对于函数式接口，我们可以通过lambda表达式来创建该接口的对象
 */
public class LambdaTest {
    public static void main(String[] args) {

        // 2、外部类实现接口
        ITestLambda t1 = new Test();
        t1.lambda();

        // 3、静态内部类实现接口
        Test2 t2 = new Test2();
        t2.lambda();

        // 4、局部内部类
        class Test3 implements ITestLambda {
            @Override
            public void lambda() {
                System.out.println("局部内部类");
            }
        }
        Test3 t3 = new Test3();
        t3.lambda();

        // 5、匿名内部类
        ITestLambda t4 = new ITestLambda() {
            @Override
            public void lambda() {
                System.out.println("匿名内部类");
            }
        };

        // 6、lambda
        ITestLambda t5 = () -> {
            System.out.println("lambda");
        };
    }

    // 3、静态内部类
    static class Test2 implements ITestLambda {
        @Override
        public void lambda() {
            System.out.println("静态内部类");
        }

    }

    // 1、定义一个函数式接口
    interface ITestLambda {
        void lambda();
    }

}

// 2、实现类
class Test implements LambdaTest.ITestLambda {
    @Override
    public void lambda() {
        System.out.println("implements TestLambda");
    }
}
