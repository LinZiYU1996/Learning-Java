package chapter_17.demo.d2;



import chapter_16.demo.d3.CountingGenerator;
import chapter_16.demo.d3.RandomGenerator;

import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 10:09
 * \* Description:
 * \
 */
public class MapDataTest {

    public static void main(String[] args) {


//        Pair Generator
        System.out.println(MapData.map(new Letter(),11));

        System.out.println("_____________________________________________________");

        System.out.println(MapData.map(new Letter(),"OPO"));
    }
}
