package better_write.Java_NIO.learn_api.Buffer_api;

import java.nio.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/2
 * \* Time: 17:22
 * \* Description:
 * \
 */
public class T7 {

    public static void main(String[] args) {

        byte[] bytes = new byte[]{1,2,3};

        short[] shorts = new short[]{1,2,3,4};

        int[] ints = new int[]{1,2,3,4,5};

        long[] longs = new long[]{1,2,3,4,5,6};

        float[] floats = new float[]{1,2,3,4,5,6,7};

        double[] doubles = new double[]{1,2,3,4,5,6,7,8};

        char[] chars = new char[]{'a','b','c','d','e'};

        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);

        ShortBuffer shortBuffer = ShortBuffer.wrap(shorts);

        IntBuffer intBuffer = IntBuffer.wrap(ints);

        LongBuffer longBuffer = LongBuffer.wrap(longs);

        FloatBuffer floatBuffer = FloatBuffer.wrap(floats);

        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubles);

        CharBuffer charBuffer = CharBuffer.wrap(chars);

        print(byteBuffer);
        print(shortBuffer);
        print(intBuffer);
        print(longBuffer);
        print(floatBuffer);
        print(doubleBuffer);
        print(charBuffer);
    }

    private static void print(Buffer buffer) {
        System.out.println("is readOnly ? : \n" +
                buffer.isReadOnly());
    }
}
