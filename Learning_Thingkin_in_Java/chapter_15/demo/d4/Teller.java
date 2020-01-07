package chapter_15.demo.d4;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:55 2020/1/7
 */
class Teller {

    private static long counter = 1;

    private final long id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller" + id;
    }

    public static Generator<Teller> generator =
            new Generator<Teller>() {
                @Override
                public Teller next() {
                    return new Teller();
                }
            };


}
