package JDK_8.Java_8_Function_Programming.chapter_3.A1;

import JDK_8.Java_8_Function_Programming.chapter_3.data.a2.Number_Data;

import java.util.Iterator;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 17:26
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        List<Integer> data = Number_Data.createData();

        int count = 0;

        for (Integer integer : data){

            if (integer > 100){
                count++;
            }
        }

        System.out.println(count);

        int num = 0;

        Iterator<Integer> integerIterator = data.iterator();

        while (integerIterator.hasNext()){

            if (integerIterator.next() > 100){
                num++;
            }

        }

        System.out.println(num);
    }
}
