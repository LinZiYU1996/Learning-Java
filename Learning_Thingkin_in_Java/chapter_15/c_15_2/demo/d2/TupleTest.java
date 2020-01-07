package chapter_15.c_15_2.demo.d2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:25 2020/1/7
 */
public class TupleTest {


    static TwoTuple<String,Integer> f(){
        return new TwoTuple<>("Hello",100);
    }

    static ThreeTuple<Apple,String,Integer> g(){
        return new ThreeTuple<>(new Apple(),"APPLE",1000);
    }

    public static void main(String[] args) {

        TwoTuple<String,Integer> twoTuple = f();

        System.out.println(twoTuple);

        ThreeTuple<Apple,String,Integer> threeTuple = g();

        System.out.println(threeTuple);

    }

}
