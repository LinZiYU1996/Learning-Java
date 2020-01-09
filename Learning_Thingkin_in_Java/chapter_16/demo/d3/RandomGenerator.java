package chapter_16.demo.d3;

import chapter_15.c_15_3.Generator;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 21:25
 * \* Description:
 * \
 */
public class RandomGenerator {

    private static Random random = new Random(20);

    public static class
    Boolean implements Generator<java.lang.Boolean> {

        @Override
        public java.lang.Boolean next() {
            return random.nextBoolean();
        }
    }

    public static class
    Byte implements Generator<java.lang.Byte> {

        @Override
        public java.lang.Byte next() {
            return (byte)random.nextInt();
        }
    }

    public static class
    Character implements Generator<java.lang.Character>{

        @Override
        public java.lang.Character next() {
            return CountingGenerator.chars[random.nextInt(CountingGenerator.chars.length)];
        }
    }


    public static class
    String extends CountingGenerator.String{

        { characterGenerator =  new Character();}

        public String(){

        }

        public String(int len){
            super(len);
        }

    }


    public static class
    Short implements Generator<java.lang.Short>{

        @Override
        public java.lang.Short next() {
            return (short)random.nextInt();
        }
    }

    public static class
    Integer implements Generator<java.lang.Integer> {

        private int mod = 10000;

        public Integer(){

        }

        public Integer(int modulo){
                mod = modulo;
        }

        @Override
        public java.lang.Integer next() {
            return random.nextInt(mod);
        }
    }

    public static class
    Float implements Generator<java.lang.Float> {


        @Override
        public java.lang.Float next() {

            int trimmed = Math.round(random.nextFloat() * 100);

            return ((float)trimmed)/100;
        }
    }


    public static class
    Double implements Generator<java.lang.Double>{


        @Override
        public java.lang.Double next() {

            long trimmed = Math.round(random.nextDouble() * 100);

            return ((double)trimmed)/100;


        }
    }

}
