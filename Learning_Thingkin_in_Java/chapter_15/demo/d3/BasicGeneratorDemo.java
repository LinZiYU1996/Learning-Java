package chapter_15.demo.d3;

import chapter_15.c_15_2.demo.d3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:16 2020/1/7
 */
public class BasicGeneratorDemo {

    public static void main(String[] args) {


        Generator<CountedObject> generator =
                BasicGenerator.create(CountedObject.class);

        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }

    }
}
