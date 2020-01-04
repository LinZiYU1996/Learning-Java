package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2020/1/4
 */
public class RegisteredFactories {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());
    }



}
