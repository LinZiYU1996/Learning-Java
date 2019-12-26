package chapter_6.demo.d1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:49 2019/12/26
 */
public class From_D extends D{


    public static void main(String[] args) {

        From_D from_d = new From_D();

//        无法访问
//        System.out.println(from_d.s1);

        System.out.println(from_d.s2);

        System.out.println(from_d.s3);

    }

}
