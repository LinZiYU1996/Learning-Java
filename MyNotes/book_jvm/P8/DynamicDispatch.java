package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 10:34
 * \* Description:
 * \
 */
public class DynamicDispatch {


/*
方法动态分派演示
 */
    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {


        @Override
        protected void sayHello() {
            System.out.println("man say hello");
        }
    }

    static class Woman extends Human {


        @Override
        protected void sayHello() {
            System.out.println("woman say hello");
        }
    }

    public static void main(String[] args) {

        Human man = new Man();

        Human woman = new Woman();

        man.sayHello();

        woman.sayHello();

        man = new Woman();

        man.sayHello();

        /*

        man say hello
        woman say hello
        woman say hello


         */

        /*

        这里不可能再根据静态类型来决定了

        因为静态类型同样都是 Human 的两个变量man 和woman在调用

        sayhello方法时执行了不同的行为

        并且变量man在两次调用中执行了不同的方法

        导致这个现象的原因很明显

        因为两个变量的实际类型不同

         */

    }


}
