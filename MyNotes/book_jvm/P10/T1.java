package book_jvm.P10;

import java.util.Arrays;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/16
 * \* Time: 14:16
 * \* Description:
 * \
 */
public class T1 {


    public static void main(String[] args) {

        List<Integer>  list= Arrays.asList(1,2,3,4);
        //如果在JDK 1.7中，还有另外一颗语法糖
        //能让上面这句代码进一步简写成List＜Integer＞list=[1，2，3，4]；
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        System.out.println(sum);

    }


    /*

    public class T1
{

    public T1()
    {
    }

    public static void main(String args[])
    {
        List list = Arrays.asList(new Integer[] {
            Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4)
        });
        int sum = 0;
        for(Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            int i = ((Integer)iterator.next()).intValue();
            sum += i;
        }

        System.out.println(sum);
    }
}


     */


}
