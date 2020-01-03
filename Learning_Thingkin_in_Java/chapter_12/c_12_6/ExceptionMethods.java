package chapter_12.c_12_6;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:55 2020/1/3
 */
public class ExceptionMethods {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch(Exception e) {
            print("Caught Exception");
            print("getMessage():" + e.getMessage());
            print("getLocalizedMessage():" +
                    e.getLocalizedMessage());
            print("toString():" + e);
            print("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }


}
