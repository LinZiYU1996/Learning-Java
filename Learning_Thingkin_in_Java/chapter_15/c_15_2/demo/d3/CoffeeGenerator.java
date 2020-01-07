package chapter_15.c_15_2.demo.d3;

import java.util.Iterator;
import java.util.Random;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:43 2020/1/7
 */
public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee>{

//    存放Class类
    private Class[] types = {
      Latte.class,
      Mocha.class,
      Cappuccino.class,
        Americano.class,
        Breve.class

    };

//    用来生成随机数
    private static Random random = new Random(47);

//    无参构造函数
    public CoffeeGenerator() {
    }

//    用来进行迭代
    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

//    生成对象
    @Override
    public Coffee next() {
        try {
            //            在types数组长度范围内随机挑选并且实例化
            return (Coffee)
                    types[random.nextInt(types.length)].newInstance();
// Report programmer errors at run time:
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

//    内部类实现Iterator接口，用以迭代
    class CoffeeIterator implements Iterator<Coffee>{

        int count = size;

//        判断能否进行迭代
        @Override
        public boolean hasNext() {
            return count > 0;
        }

//        进行迭代，返回一个具体对象
        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    };

//返回CoffeeIterator迭代器
    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {

        CoffeeGenerator generator = new CoffeeGenerator();

        for (int i = 0; i < 5 ; i++) {
            System.out.println(generator.next());
        }

        System.out.println("___________________________________");

        for (Coffee c : new CoffeeGenerator(5)){
            System.out.println(c);
        }

    }
}
