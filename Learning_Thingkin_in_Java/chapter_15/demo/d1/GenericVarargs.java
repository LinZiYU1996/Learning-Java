package chapter_15.demo.d1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:30 2020/1/7
 */
public class GenericVarargs {

    public static <T> List<T> makeList(T...args){

        List<T> res = new ArrayList<>();

// 循环遍历
        for (T item : args){

            res.add(item);

        }

        return res;

    }

    public static void main(String[] args) {

        List<String> ls = makeList("A");

        System.out.println(ls);

        ls = makeList("A","b","C");

        System.out.println(ls);



    }

}
