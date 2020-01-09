package chapter_16.demo.d2;

import chapter_16.demo.d1.Matter;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 16:03
 * \* Description:
 * \
 */
public class ArrayOfGenerics {

    public static void main(String[] args) {


        List<String>[] ls;

        List[] la = new List[10];


//        Unchecked assignment: 'java.util.List[]' to 'java.util.List<java.lang.String>[]'
        ls = la;

        ls[0] = new ArrayList<String>();

//        error
//        ls[1] = new ArrayList<Integer>();

//        List<String>也是一个Object[]
        Object[] objects = ls;

        objects[1] = new ArrayList<Integer>();


//        Unchecked assignment: 'java.util.List[]' to 'java.util.List<chapter_16.demo.d1.Matter>[]'
        List<Matter>[] matterList =
                new List[10];

        for (int i = 0; i < matterList.length; i++) {
            matterList[i] = new ArrayList<>();
        }


    }
}
