package chapter_16.c_16_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:59 2020/1/6
 */
public class ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];

        for(int i = 0; i < 5; i++)
            spheres[i] = new BerylliumSphere();

        print(Arrays.toString(spheres));

        print(spheres[4]);

        List<BerylliumSphere> sphereList =
                new ArrayList<BerylliumSphere>();

        for(int i = 0; i < 5; i++)
            sphereList.add(new BerylliumSphere());

        print(sphereList);

        print(sphereList.get(4));

        int[] integers = { 0, 1, 2, 3, 4, 5 };

        print(Arrays.toString(integers));

        print(integers[4]);

        List<Integer> intList = new ArrayList<Integer>(
                Arrays.asList(0, 1, 2, 3, 4, 5));

        intList.add(97);

        print(intList);

        print(intList.get(4));
    }



}
