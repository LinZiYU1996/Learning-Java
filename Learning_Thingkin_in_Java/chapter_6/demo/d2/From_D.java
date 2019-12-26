package chapter_6.demo.d2;

import chapter_6.demo.d1.D;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:51 2019/12/26
 */
public class From_D extends D {

    public static void main(String[] args) {

        From_D from_d = new From_D();

//        此时s1  s2 都无法访问

        System.out.println(from_d.s3);

    }


}
