package chapter_15.c_15_7;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:21 2020/1/5
 */
public class ErasedTypeEquivalence {

    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }

//    ArrayList<.Strin贮和ArrayList<lnteger>很容易被认为是不同的类型。 不同的类型在行为方面肯定不同， 例如， 如果尝试若将一个Integer放入ArrayList<.String>, 所得到的行为（将失败）
//与把一个Integer放入ArrayList<lnteger> (将成功）所得到的行为完全不同。 但是上面的程序会
//认为它们是相同的类型。




}
