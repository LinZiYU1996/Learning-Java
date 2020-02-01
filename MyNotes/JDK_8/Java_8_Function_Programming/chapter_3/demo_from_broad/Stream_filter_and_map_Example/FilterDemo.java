package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_filter_and_map_Example;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 13:22
 * \* Description:
 * \
 */
public class FilterDemo {

// java 8 stream filter and map. These methods are intermediate operations. Filter filters a stream on the basis of a given predicate and returns stream object. And again we can apply other stream methods to this instance. Map is stream function that applies a given function to all its elements and returns the changed stream. Find the method syntax.
//Stream<T> filter(Predicate<? super T> predicate) We pass predicate as an argument on the basis of which filter method filters the stream and returns the changed stream object.
//<R> Stream<R> map(Function<? super T,? extends R> mapper) We pass a function as an argument which is applied to all its element of stream and then it returns the changed stream object.


    public static void main(String[] args) {


        //Stream.filter
        //Stream.filter() filters the calling stream on the basis of given Predicate. In the example we have an employee list and created a Predicate. This Predicate will be passed to filter as an argument. Finally we will print the filtered stream.

        List<Employee> list = Employee.getEmpList();

        Predicate<Employee> predicate = employee ->

            employee.id>1 && employee.sal < 6000;

        Consumer<Employee> consumer = employee ->
                System.out.println(employee.id + "   " + employee.sal);

        list.stream()
                .filter(predicate)
                .forEach(consumer);


    }
}
