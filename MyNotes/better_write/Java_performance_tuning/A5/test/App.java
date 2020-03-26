package better_write.Java_performance_tuning.A5.test;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 11:20
 * \* Description:
 * \
 */
public class App {

    public static void main( String[] args )
    {

        ArrayListTest.addFromHeaderTest(100000);
        LinkedListTest.addFromHeaderTest(100000);


        ArrayListTest.addFromMidTest(10000);
        LinkedListTest.addFromMidTest(10000);

        ArrayListTest.addFromTailTest(1000000);
        LinkedListTest.addFromTailTest(1000000);

        ArrayListTest.deleteFromHeaderTest(100000);
        LinkedListTest.deleteFromHeaderTest(100000);

        ArrayListTest.deleteFromMidTest(100000);
        LinkedListTest.deleteFromMidTest(100000);

        ArrayListTest.deleteFromTailTest(1000000);
        LinkedListTest.deleteFromTailTest(1000000);

        ArrayListTest.getByForTest(10000);
        LinkedListTest.getByForTest(10000);

        ArrayListTest.getByIteratorTest(100000);
        LinkedListTest.getByIteratorTest(100000);
    }
/*


1秒=1000毫秒=1000000微秒

 */
}

//ArrayList从集合头部位置新增元素花费的时间485
//LinkedList从集合头部位置新增元素花费的时间12


//ArrayList从集合中间位置新增元素花费的时间3
//LinkedList从集合中间位置新增元素花费的时间228


//ArrayList从集合尾部位置新增元素花费的时间473
//LinkedList从集合尾部位置新增元素花费的时间320

//ArrayList从集合头部位置删除元素花费的时间406
//LinkedList从集合头部位置删除元素花费的时间0

//ArrayList从集合中间位置删除元素花费的时间172
//LinkedList从集合中间位置删除元素花费的时间11856


//ArrayList从集合尾部位置删除元素花费的时间0
//LinkedList从集合尾部位置删除元素花费的时间28


//ArrayList for(;;)循环花费的时间0
//LinkedList for(;;)循环花费的时间85


//ArrayList 迭代器迭代循环花费的时间0
//LinkedList 迭代器迭代循环花费的时间0


