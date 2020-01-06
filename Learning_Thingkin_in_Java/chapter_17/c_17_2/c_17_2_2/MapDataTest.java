package chapter_17.c_17_2.c_17_2_2;

import chapter_16.c_16_6.c_16_6_2.CountingGenerator;
import chapter_16.c_16_6.c_16_6_2.RandomGenerator;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:38 2020/1/6
 */
public class MapDataTest {

    public static void main(String[] args) {
// Pair Generator:
        print(MapData.map(new Letters(), 11));
// Two separate generators:
        print(MapData.map(new CountingGenerator.Character(),
                new RandomGenerator.String(3), 8));
// A key Generator and a single value:
        print(MapData.map(new CountingGenerator.Character(),
                "Value", 6));
// An Iterable and a value Generator:
        print(MapData.map(new Letters(),
                new RandomGenerator.String(3)));
// An Iterable and a single value:
        print(MapData.map(new Letters(), "Pop"));
    }
}
