package chapter_15.c_15_5;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:17 2020/1/5
 */
public class Teller {

    private static long counter = 1;
    private final long id = counter++;
    private Teller() {}
    public String toString() { return "Teller " + id; }
    // A single Generator object:
    public static Generator<Teller> generator =
            new Generator<Teller>() {
                public Teller next() { return new Teller(); }
            };


}
