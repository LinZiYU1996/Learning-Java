package chapter_15.c_15_4.c_15_4_4;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:12 2020/1/5
 */
public class BasicGeneratorDemo {

    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }


}
