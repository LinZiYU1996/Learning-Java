package chapter_10.c_10_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 13:24 2019/12/30
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println(Math.floorMod(33672, 2808));
        for(int i = 1; i <= 170 ; i++){
            if (Math.floorMod(i*i,17) == 69){
                System.out.println(i);
                break;
            }
        }

    }
}
