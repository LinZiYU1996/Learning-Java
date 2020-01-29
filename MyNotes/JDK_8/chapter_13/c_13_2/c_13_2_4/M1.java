package JDK_8.chapter_13.c_13_2.c_13_2_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 14:07
 * \* Description:
 * \
 */
public class M1 {

    public static List<List<Integer>> subsets(List<Integer> list){

        if (list.isEmpty()) {
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(Collections.emptyList());
            return ans;
        }

        Integer first = list.get(0);

        List<Integer> rest = list.subList(1,list.size());

        List<List<Integer>> subans = subsets(rest);

        List<List<Integer>> subans2 = insertAll(first,subans);

        return concat(subans,subans2);
    }


    public static List<List<Integer>> insertAll(Integer first,
                                                List<List<Integer>> lists) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> list : lists) {

//            复制列表，从而使你有机会对其
//进行添加操作。即使底层是可变
//的，你也不应该复制底层的结构
//（不过 Integer 底层是不可变的）
            List<Integer> copyList = new ArrayList<>();
            copyList.add(first);
            copyList.addAll(list);
            result.add(copyList);
        }
        return result;
    }

    public static List<List<Integer>> concat(List<List<Integer>> a,
                                             List<List<Integer>> b) {

//        它在内部会对对象进行修改（向列
//表 r 添加元素），但是它返回的结果基于参数却没有修改任何一个传入的参数
        List<List<Integer>> r = new ArrayList<>(a);
        r.addAll(b);
        return r;
    }


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(

                1,4,9
        );

        System.out.println(subsets(list));

    }


}
