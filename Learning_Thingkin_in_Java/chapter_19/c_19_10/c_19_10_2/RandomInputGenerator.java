package chapter_19.c_19_10.c_19_10_2;

import chapter_15.c_15_2.demo.d3.Generator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 19:42
 * \* Description:
 * \
 */
public class RandomInputGenerator implements Generator<Input> {

        public Input next() { return Input.randomSelection(); }


}

