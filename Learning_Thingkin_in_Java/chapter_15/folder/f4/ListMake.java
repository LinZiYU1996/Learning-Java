package chapter_15.folder.f4;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:56 2020/1/7
 */
public class ListMake<T> {

    List<T> create(){
        return new ArrayList<T>();
    }

    public static void main(String[] args) {


        ListMake<String> stringListMake = new ListMake<>();

        List<String> stringList = stringListMake.create();



    }
}
