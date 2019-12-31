package chapter_10.c_10_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:04 2019/12/31
 */
public class Test_01 {


    private static boolean isPrime(int src) {
        double sqrt = Math.sqrt(src);
        if (src < 2) {
            return false;
        }
        if (src == 2 || src == 3) {
            return true;
        }
        if (src % 2 == 0) {// 先判断是否为偶数，若偶数就直接结束程序
            return false;
        }
        for (int i = 3; i <= sqrt; i+=2) {
            if (src % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        for (int i = 1; i < 52930 ; i++) {
            for (int j = 1; j < 52930 ; j++) {

                if (i*j == 5293) {

                    if (isPrime(i) && isPrime(j)){

                        System.out.println(i);
                        System.out.println(j);

                    }



                }



            }

        }
    }



}
