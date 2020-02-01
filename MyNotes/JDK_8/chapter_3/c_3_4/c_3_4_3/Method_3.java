package JDK_8.chapter_3.c_3_4.c_3_4_3;

import JDK_8.chapter_2.c_2_1.c_2_1_1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/25
 * \* Time: 11:38
 * \* Description:
 * \
 */
public class Method_3 {


//    布尔表达式
//(List<String> list) -> list.isEmpty()  Predicate<List<String>>

//    创建对象
//() -> new Apple(10)  Supplier<Apple>

//    消费一个对象
//(Apple a) ->
//System.out.println(a.getWeight())
//Consumer<Apple>

//    从一个对象中
//选择/提取
//(String s) -> s.length()
//Function<String, Integer> 或
//ToIntFunction<String>


//合并两个值
//(int a, int b) -> a * b  IntBinaryOperator


//比较两个对象
//(Apple a1, Apple a2) ->
//a1.getWeight().compareTo(a2.getWeight())
//Comparator<Apple> 或
//BiFunction<Apple, Apple, Integer>
//或 ToIntBiFunction<Apple, Apple>




    public static <T>List<T> getEmptyList(List<T> source, Predicate<T> predicate){
        List<T> res = new ArrayList<>();
        for (T t : source){
            if (predicate.test(t)){
                res.add(t);
            }
        }
        return res;
    }

    public static Apple getTinstacne(Supplier<Apple> supplier){
        return supplier.get();
    }

    public static <T> void theConsumer(Consumer<T> consumer,T t){
            consumer.accept(t);
    }

    public static <T,R> List<R> theFunction(Function<T,R> function,List<T> list) {

        List<R> rs = new ArrayList<>();

        for (T t : list){
            rs.add(function.apply(t));
        }

        return rs;
    }

    public static int the_IntBinaryOperator(IntBinaryOperator intBinaryOperator,int t1,int t2){
        return intBinaryOperator.applyAsInt(t1,t2);
    }

    public static <T> int the_Comparator(Comparator<T> comparator,
                                             T t1,T t2){

        return comparator.compare(t1,t2);

    }

    public static void main(String[] args) {

        List<String> source = new ArrayList<>();
        source.add("");
        source.add("jjskfdiskj");
        source.add("");
        source.add("5645644565");
        source.add("8yqwhyr8f83r");
        Predicate<String> stringPredicate = (string) -> !string.isEmpty();

        System.out.println(getEmptyList(source,stringPredicate));
        System.out.println("====================================");


        Supplier<Apple> appleSupplier = () -> new Apple("KOL");

        System.out.println(getTinstacne(appleSupplier));
        System.out.println("====================================");
        Consumer<Apple> appleConsumer = (apple -> System.out.println(apple));

        theConsumer(appleConsumer,new Apple("jdjdjd",554655456));

        Function<String,Integer> stringIntegerFunction = (s -> s.length());

        List<String> strings = Arrays.asList(
                "njashf",
                "",
                "asjasjiaifhaih",
                "4566556465",
                "jdadjj"

        );
        System.out.println("====================================");

        System.out.println(theFunction(stringIntegerFunction,strings));

        System.out.println("====================================");

        IntBinaryOperator intBinaryOperator = (int a1,int a2) -> (a1 + a2);

        System.out.println(the_IntBinaryOperator(intBinaryOperator,45645,5645));

        System.out.println("====================================");






    }
}
