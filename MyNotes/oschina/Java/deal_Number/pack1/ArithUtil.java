package oschina.Java.deal_Number.pack1;

import java.math.BigDecimal;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/5/2
 * \* Time: 11:47
 * \* Description:
 * \
 */
public class ArithUtil {


    public static void main(String[] args) {



    }
    /**
     * 提供精确的浮点数运算(包括加、减、乘、除、四舍五入)工具类
     */


        // 除法运算默认精度
        private static final int DEF_DIV_SCALE = 10;

        private ArithUtil() {

        }

        /**
         * 精确加法
         */
        public static double add(double value1, double value2) {
            BigDecimal b1 = BigDecimal.valueOf(value1);
            BigDecimal b2 = BigDecimal.valueOf(value2);
            return b1.add(b2).doubleValue();
        }

        /**
         * 精确减法
         */
        public static double sub(double value1, double value2) {
            BigDecimal b1 = BigDecimal.valueOf(value1);
            BigDecimal b2 = BigDecimal.valueOf(value2);
            return b1.subtract(b2).doubleValue();
        }

        /**
         * 精确乘法
         */
        public static double mul(double value1, double value2) {
            BigDecimal b1 = BigDecimal.valueOf(value1);
            BigDecimal b2 = BigDecimal.valueOf(value2);
            return b1.multiply(b2).doubleValue();
        }

        /**
         * 精确除法 使用默认精度
         */
        public static double div(double value1, double value2) throws IllegalAccessException {
            return div(value1, value2, DEF_DIV_SCALE);
        }

        /**
         * 精确除法
         * @param scale 精度
         */
        public static double div(double value1, double value2, int scale) throws IllegalAccessException {
            if(scale < 0) {
                throw new IllegalAccessException("精确度不能小于0");
            }
            BigDecimal b1 = BigDecimal.valueOf(value1);
            BigDecimal b2 = BigDecimal.valueOf(value2);
            // return b1.divide(b2, scale).doubleValue();
            return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        }

        /**
         * 四舍五入
         * @param scale 小数点后保留几位
         */
        public static double round(double v, int scale) throws IllegalAccessException {
            return div(v, 1, scale);
        }

        /**
         * 比较大小
         */
        public static boolean equalTo(BigDecimal b1, BigDecimal b2) {
            if(b1 == null || b2 == null) {
                return false;
            }
            return 0 == b1.compareTo(b2);
        }

}
