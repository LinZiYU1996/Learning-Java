package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Sum_Array_Map_and_List_Collection_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:02
 * \* Description:
 * \
 */
public class Demo3 {

    //Sum using Collectors.summarizingInt() with Stream.collect() and IntSummaryStatistics


    public static void main(String[] args) {

        //To get the sum of values we can use Collectors.summarizingInt() with Stream.collect() and IntSummaryStatistics.

        //IntSummaryStatistics stats = list.stream()
        //    			     .collect(Collectors.summarizingInt(Line::getLength));
        //IntSummaryStatistics stats = list.stream().flatMap(a->Arrays.stream(a))
        //			         .collect(Collectors.summarizingInt(i->i));
        //System.out.println(stats.getSum());

        //For long data type, we use summingLong with LongSummaryStatistics and for double data type there is summingDouble with DoubleSummaryStatistics in java 8.




    }
}
