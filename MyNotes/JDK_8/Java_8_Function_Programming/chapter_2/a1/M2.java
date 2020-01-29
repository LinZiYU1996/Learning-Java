package JDK_8.Java_8_Function_Programming.chapter_2.a1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 20:33
 * \* Description:
 * \
 */
public class M2 {


    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    public static void main(String[] args) {

        M2 m2 = new M2();

        // 类型声明
        MathOperation addition  = (int a,int b) -> a + b;

              // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);


        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");

        System.out.println("10 + 5 = " + m2.operate(10, 5, addition));
        System.out.println("10 - 5 = " + m2.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + m2.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + m2.operate(10, 5, division));



    }
}
