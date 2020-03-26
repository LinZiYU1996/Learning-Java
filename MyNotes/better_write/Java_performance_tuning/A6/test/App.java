package better_write.Java_performance_tuning.A6.test;

import java.util.ArrayList;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/25
 * \* Time: 11:37
 * \* Description:
 * \
 */
public class App {

    public static void main( String[] args )
    {
        List<Student> studentsList = new ArrayList<Student>();

        for(int i=0; i<10000000; i++) {
            Student stu = new Student();
            stu.setHeight(156 + i);
            stu.setSex(String.valueOf(i%2));
            studentsList.add(stu);
        }

        IteratorTest.IteratorForObjectTest(studentsList);
        SerialStreamTest.SerialStreamForObjectTest(studentsList);
        ParallelStreamTest.ParallelStreamForObjectTest(studentsList);

        /*

        Iterator花费的时间3210
        Stream并行花费的时间406
        Stream花费的时间297

         */

//    	int[] arr = new int[100000000];
//
//    	Random r = new Random();
//		for(int i=0; i<arr.length; i++){
//			arr[i] = r.nextInt();
//		}
//
//    	IteratorTest.IteratorForIntTest(arr);
//    	SerialStreamTest.SerialStreamForIntTest(arr);
//    	ParallelStreamTest.ParallelStreamForIntTest(arr);


    }
}
