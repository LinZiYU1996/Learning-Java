package chapter_15.c_15_2.c_15_2_1.d;

import chapter_15.c_15_2.c_15_2_1.FiveTuple;
import chapter_15.c_15_2.c_15_2_1.FourTuple;
import chapter_15.c_15_2.c_15_2_1.ThreeTuple;
import chapter_15.c_15_2.c_15_2_1.TwoTuple;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:11 2020/1/5
 */
public class TupleTest {

    static TwoTuple<String,Integer> f() {
// Autoboxing converts the int to Integer:
        return new TwoTuple<String,Integer>("hi", 47);
    }
    static ThreeTuple<Amphibian,String,Integer> g() {
        return new ThreeTuple<Amphibian, String, Integer>(
                new Amphibian(), "hi", 47);
    }
    public static FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return
                new FourTuple<Vehicle,Amphibian,String,Integer>(
                        new Vehicle(), new Amphibian(), "hi", 47);
    }
    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return new
                FiveTuple<Vehicle,Amphibian,String,Integer,Double>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }
    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
// ttsi.first = "there"; // Compile error: final
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
