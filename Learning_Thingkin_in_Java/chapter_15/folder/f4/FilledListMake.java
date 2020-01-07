package chapter_15.folder.f4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:58 2020/1/7
 */
public class FilledListMake<T> {

    List<T> create(T t,int n){
        List<T> res = new ArrayList<>();

        for (int i = 0; i < n ; i++) {

            res.add(t);
        }

        return res;

    }

    public static void main(String[] args) {

        FilledListMake<String> stringFilledListMake =
                new FilledListMake<>();

        List<String> list = stringFilledListMake.create("World",20);

        System.out.println(list);

    }

}
