package JDK_8.chapter_6.c_6_5.c_6_5_2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 11:48
 * \* Description:
 * \
 */


//开发自己的 ToListCollector
public class ToListCollector<T> implements Collector<T, List<T>,List<T>> {


//    创建集合操//作的起始点
    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }


//    累 积 遍 历 过的//项目，原位修改//累加器
    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }



    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1,list2) ->{

//            修 改 第 一 个 累 加//器，将其与第二个//累加器的内容合并
            list1.addAll(list2);

//            返回修改后的//第一个累加器
            return list1;
        };
    }


//    恒等//函数
    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity();
    }

//    为收集器添加 IDENTITY//_FINISH 和 CONCURRENT 标志
    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(
                IDENTITY_FINISH, CONCURRENT));
    }


//    这个实现与 Collectors.toList 方法并不完全相同，但区别仅仅是一些小的优化。
//这些优化的一个主要方面是Java API所提供的收集器在需要返回空列表时使用了 Collections.
//emptyList() 这个单例（singleton）


}
