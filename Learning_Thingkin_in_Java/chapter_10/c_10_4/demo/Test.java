package chapter_10.c_10_4.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:05 2020/1/1
 */
public class Test {

    public static void main(String[] args) {

        Outter outter = new Outter();

        GetString getString = outter.getString("HHe");

        GetValue getValue = outter.getValue();

        String s = getString.getString();

        System.out.println(s);


//        非法 不能访问私有类

//        Outter.GetStrings GetStrings = outter.new GetStrings();


    }
}
