package chapter_15.c_15_4.c_15_4_5;

import chapter_15.c_15_2.c_15_2_1.FiveTuple;
import chapter_15.c_15_2.c_15_2_1.FourTuple;
import chapter_15.c_15_2.c_15_2_1.ThreeTuple;
import chapter_15.c_15_2.c_15_2_1.TwoTuple;
import chapter_15.c_15_2.c_15_2_1.d.Amphibian;
import chapter_15.c_15_2.c_15_2_1.d.Vehicle;

import static chapter_15.c_15_4.c_15_4_5.Tuple.tuple;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:13 2020/1/5
 */
public class TupleTest2 {


    static TwoTuple<String,Integer> f() {
        return tuple("hi", 47);
    }


    static TwoTuple f2() { return tuple("hi", 47); }


    static ThreeTuple<Amphibian,String,Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }


    static FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }


    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return tuple(new Vehicle(), new Amphibian(),
                "hi", 47, 11.1);
    }


    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
