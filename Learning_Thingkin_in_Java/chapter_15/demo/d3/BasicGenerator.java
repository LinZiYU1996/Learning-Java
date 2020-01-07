package chapter_15.demo.d3;

import chapter_15.c_15_2.demo.d3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:09 2020/1/7
 */
public class BasicGenerator<T> implements Generator<T> {

    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return
                    type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }


//    这个类提供了一个基本实现，用来生成某个类的对象
}
