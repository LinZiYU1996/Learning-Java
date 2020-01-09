package chapter_16.demo.d4;

import chapter_15.c_15_3.Generator;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 22:28
 * \* Description:
 * \
 */
public class CompType implements Comparable<CompType>{

    int i;

    int j;

    private static int count = 1;

    @Override
    public String toString() {
        return "CompType{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    public CompType(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public int compareTo(CompType o) {
        return (i < o.i ? -1 : (i == o.i) ? 0 : 1);
    }

    private static Random random = new Random(56);

    public static Generator<CompType> generator(){

        return new Generator<CompType>(){
            @Override
            public CompType next() {
                return new CompType(random.nextInt(100),random.nextInt(100));
            }
        };

    }


    public static void main(String[] args) {

//        CompType[] a =
//                generated
    }

}
