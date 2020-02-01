package JDK_8.functional_interface.Java_Custom_Functional_Interface;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:28
 * \* Description:
 * \
 */
public class Test1 {


    public static void main(String[] args) {

        List<MyNumber> list = new ArrayList<>();
        list.add(new MyNumber(100, 40));
        list.add(new MyNumber(300, 60));
        list.add(new MyNumber(60, 20));


        System.out.println("Example-1:\n");

        System.out.println("");
        Calculator calculator = (x,y) -> x + y;

        for (MyNumber myNumber : list){
            System.out.println(myNumber.process(calculator));
        }

        System.out.println("");
        System.out.println("Example-2:\n");

        for (MyNumber myNumber : list){
            System.out.println(
                    myNumber.process((x,y) -> x * y)
            );
        }

        System.out.println("Example-3:\n");

        System.out.println("");

        for (MyNumber myNumber : list){
            System.out.println(
                    myNumber.process((x,y) -> x/y)
            );
        }
    }

}
