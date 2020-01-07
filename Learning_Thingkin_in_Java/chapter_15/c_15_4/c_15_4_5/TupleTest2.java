package chapter_15.c_15_4.c_15_4_5;

import chapter_15.c_15_2.c_15_2_1.TwoTuple;

import static chapter_15.c_15_4.c_15_4_5.Tuple.tuple;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:13 2020/1/5
 */
public class TupleTest2 {


    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }



    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
    }
}
