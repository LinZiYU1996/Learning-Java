package chapter_10.c_10_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:23 2019/12/31
 */
public class Test_02 {


    public static void main(String[] args) {

        for(int i = 1 ; i <1000000 ; i++){

            if (Math.floorMod(i*13,5148) == 1)
                System.out.println(i);

        }


    }
}
