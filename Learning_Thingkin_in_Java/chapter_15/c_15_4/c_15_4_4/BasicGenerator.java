package chapter_15.c_15_4.c_15_4_4;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:11 2020/1/5
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;
    public BasicGenerator(Class<T> type){ this.type = type; }
    public T next() {
        try {
// Assumes type is a public class:
        return type.newInstance();
    } catch(Exception e) {
        throw new RuntimeException(e);
    }
    }
    // Produce a Default generator given a type token:
    public static <T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<T>(type);
    }
}
