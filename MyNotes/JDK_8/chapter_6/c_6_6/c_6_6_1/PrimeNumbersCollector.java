//package JDK_8.chapter_6.c_6_6.c_6_6_1;
//
//import java.util.*;
//import java.util.function.BiConsumer;
//import java.util.function.BinaryOperator;
//import java.util.function.Function;
//import java.util.function.Supplier;
//import java.util.stream.Collector;
//
//import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
//
///**
// * \* Created with IntelliJ IDEA.
// * \* User: LinZiYu
// * \* Date: 2020/1/27
// * \* Time: 13:03
// * \* Description:
// * \
// */
//public class PrimeNumbersCollector implements Collector<Integer, Map<Boolean, List<Integer>>,Map<Boolean, List<Integer>>> {
//
//
////    归约过程
//    @Override
//    public Supplier<Map<Boolean, List<Integer>>> supplier() {
//        return ()-> new HashMap<Boolean,List<Integer>>(){{
//            put(true,new ArrayList<Integer>());
//            put(false,new ArrayList<Integer>());
//        }
//
//        };
//
////        这里不但创建了用作累加器的 Map ，还为 true 和 false 两个键下面初始化了对应的空列表。
////在收集过程中会把质数和非质数分别添加到这里
//    }
//
//    @Override
//    public BiConsumer<Map<Boolean, List<Integer>>, Integer> accumulator() {
//        return (Map<Boolean,List<Integer>> acc,Integer candidate) ->
//        {
////            根据 isPrime 的//结果，获取质数//或非质数列表
//            acc.get(M1.isPrime(acc.get(true),candidate))
//
////                    将被测数添加到//相应的列表中
//                    .add(candidate);
//        };
//    }
//
//
////    在并行收集时把两个部分累加器合并起来，这里，它只需要合并两个 Map ，即
////将第二个 Map 中质数和非质数列表中的所有数字合并到第一个 Map 的对应列表中就行了
//    @Override
//    public BinaryOperator<Map<Boolean, List<Integer>>> combiner() {
//        return (Map<Boolean, List<Integer>> map1,
//                Map<Boolean, List<Integer>> map2) ->
//        {
//            map1.get(true).addAll(map2.get(true));
//            map1.get(false).addAll(map2.get(false));
//            return map1;
//        };
//    }
//
//    @Override
//    public Function<Map<Boolean, List<Integer>>, Map<Boolean, List<Integer>>> finisher() {
//        return Function.identity();
//    }
//
//    @Override
//    public Set<Characteristics> characteristics() {
//        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH));
//    }
//}
