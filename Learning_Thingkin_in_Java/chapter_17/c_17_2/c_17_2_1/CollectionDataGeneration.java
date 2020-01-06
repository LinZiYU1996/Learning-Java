package chapter_17.c_17_2.c_17_2_1;

import chapter_16.c_16_6.c_16_6_2.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:34 2020/1/6
 */
public class CollectionDataGeneration {

    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list( // Convenience method
                        new RandomGenerator.String(9), 10)));
        System.out.println(new HashSet<Integer>(
                new CollectionData<Integer>(
                        new RandomGenerator.Integer(), 10)));
    }


}
