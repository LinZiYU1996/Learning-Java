package JDK_8.Java_8_Function_Programming.chapter_3.A5.a3;

import java.io.UnsupportedEncodingException;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 15:06
 * \* Description:
 * \
 */
public class Test {

    public static String getRandomJianHan(int len) {
        String ret = "";
        for (int i = 0; i < len; i++) {
            String str = null;
            int hightPos, lowPos; // 定义高低位
            Random random = new Random();
            hightPos = (176 + Math.abs(random.nextInt(39))); // 获取高位值
            lowPos = (161 + Math.abs(random.nextInt(93))); // 获取低位值
            byte[] b = new byte[2];
            b[0] = (new Integer(hightPos).byteValue());
            b[1] = (new Integer(lowPos).byteValue());
            try {
                str = new String(b, "GBK"); // 转成中文
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
            ret += str;
        }
        return ret;
    }


    public static void main(String[] args) {


        Integer min = 2;
        Integer max = 3;

        Random random = new  Random();

        /**
         * random.nextInt(max) % (max-min+1)  ->  [0, 499] % 301 == [0, 300]
         * [0, 300] + 200 = [200, 500]
         */

//        System.out.println(result);
        for (int i = 0; i < 5; i++) {
            int result = random.nextInt(max) % (max-min+1) + min;
            System.out.println(getRandomJianHan(result));
        }

    }

}
