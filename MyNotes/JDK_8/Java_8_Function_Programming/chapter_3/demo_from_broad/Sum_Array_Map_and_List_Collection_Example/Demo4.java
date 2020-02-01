package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Sum_Array_Map_and_List_Collection_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:03
 * \* Description:
 * \
 */
public class Demo4 {

    //Sum using Stream.reduce() with BiFunction and BinaryOperator


    public static void main(String[] args) {

        //To get the sum of values we can use Stream.reduce() with BiFunction as accumulator and BinaryOperator as combiner in parallel processing.


        //int sum = list.parallelStream().reduce(0, (output, ob) -> output + ob.getLength(), (a, b) -> a + b);

        //Here 0 is an identity. Identity is operated using BinaryOperator to each and every element of stream. If identity is 0, then it results into the sum of elements of stream in our example.


    }

}
