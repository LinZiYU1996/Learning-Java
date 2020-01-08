package chapter_15.bag.b1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:27
 * \* Description:
 * \
 */
public class ArrayOfGeneric {

    static final int SIZE = 100;

    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        gia = (Generic<Integer>[]) new Object[SIZE];

        gia = new Generic[SIZE];

        System.out.println(gia.getClass().getSimpleName());

        gia[0] = new Generic<Integer>();

//        gia[1] = new Object();

//        gia[2] = new Generic<Double>();



    }


}
