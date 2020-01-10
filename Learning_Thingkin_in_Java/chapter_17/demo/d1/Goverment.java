package chapter_17.demo.d1;

import chapter_15.c_15_3.Generator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 9:47
 * \* Description:
 * \
 */
public class Goverment implements Generator<String> {

    String[] foundation = ("A H J H D D H H H S A D H D H D J D").split(" ");

    private int index;



    @Override
    public String next() {
        return foundation[index++];
    }
}
