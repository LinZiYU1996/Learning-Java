package book_jvm.P7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 20:31
 * \* Description:
 * \
 */
public class FieldResolution {


    interface Int0 {
        int a = 0;
    }

    interface int1 extends Int0{
        int a = 1;
    }

    interface int2 {
        int a = 2;
    }

    static class Parent implements int2 {
        public static int a = 3;
    }

    static class Sub extends Parent implements int2 {
        public static int a =4;
    }

    public static void main(String[] args) {


        /*
        如果注释了 Sub中的
                public static int a =4;

语句 就会报错


         */
        System.out.println(Sub.a);

    }


}
