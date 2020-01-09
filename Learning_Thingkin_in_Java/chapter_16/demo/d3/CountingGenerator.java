package chapter_16.demo.d3;

import chapter_15.c_15_3.Generator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 21:05
 * \* Description:
 * \
 */
public class CountingGenerator {

    public static class
    Boolean implements Generator<java.lang.Boolean> {

        private boolean value = false;
        @Override
        public java.lang.Boolean next() {
            value = !value;
            return value;
        }
    }

    public static class
    Byte implements Generator<java.lang.Byte> {

        private byte value = 0;

        @Override
        public java.lang.Byte next() {
            return value++;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class
    Character implements Generator<java.lang.Character>{

        int index = -1;

        @Override
        public java.lang.Character next() {
            index = (index+1) % chars.length;
            return chars[index];
        }
    }

    public static class
    String implements Generator<java.lang.String>{

        private int len = 7;

        Generator<java.lang.Character> characterGenerator = new Character();

        public String(){

        }

        public String(int len){
            this.len = len;
        }

        @Override
        public java.lang.String next() {
            char[] buf = new char[len];

            for (int i = 0; i < len; i++) {
                buf[i] = characterGenerator.next();
            }

            return new java.lang.String(buf);
        }
    }


    public static class
    Short implements Generator<java.lang.Short>{

        private short value = 0;

        @Override
        public java.lang.Short next() {
            return value++;
        }
    }

    public static class
    Integer implements Generator<java.lang.Integer> {

        private int value = 0;

        @Override
        public java.lang.Integer next() {
            return value++;
        }
    }


    public static class
    Long implements Generator<java.lang.Long> {

        private long value = 0;

        @Override
        public java.lang.Long next() {
            return value++;
        }
    }


    public static class
    Float implements Generator<java.lang.Float> {

        private float value = 0;

        @Override
        public java.lang.Float next() {

            float res = value;

            value+=1.0;

            return res;
        }
    }


    public static class
    Double implements Generator<java.lang.Double>{

        private double value = 0.0;

        @Override
        public java.lang.Double next() {

            double res = value;

            value += 1.0;
            return res;
        }
    }
}
