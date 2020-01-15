package C_1.c_1_8;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/15
 * \* Time: 19:49
 * \* Description:
 * \
 */
public class T1 {

//    Raw use of parameterized class 'List'
//    public void test(List list){
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }

    public static void test(List<Object> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

//        test(strings);

//        List<?> list = new ArrayList<String>();
//
//        list.add(new Object());

    }



}
