package chapter_15.bag.b1.b7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:56
 * \* Description:
 * \
 */
public class CovarianArrays {

    public static void main(String[] args) {

//      创建了一个Apple数组，并将其赋值给了一个Fruit数组引用，这是有意义的
//        因为Apple也是一种Fruit。所以Apple数组也是一个Fruit数组
        Fruit[] fruits = new Apple[10];

        fruits[0] = new Apple();

        fruits[1] = new Jonathan();

//        error
//        fruits[0] = new Fruit();

//        error
//        fruits[0] = new Orange();



    }
}
