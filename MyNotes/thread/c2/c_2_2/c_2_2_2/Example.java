package thread.c2.c_2_2.c_2_2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:50
 * \* Description:
 * \
 */
public class Example {

//    各大航空公司
    private static List<String> fightCompany =
            Arrays.asList(
              "CSA","CEA","HNA"
            );

    public static void main(String[] args) {

        List<String> res = search("上海","北京");
        System.out.println("=======================res=========================");

        res.forEach(System.out::println);


    }

    private static List<String> search(String original,String dest){

        final List<String> res = new ArrayList<>();


//        创建查询航班信息的线程列表
        List<FightQueryTask> tasks = fightCompany.stream()
                .map(f->createTask(f,original,dest))
                .collect(Collectors.toList());


//        分别启动这几个线程
        tasks.forEach(Thread::start);


//        分别调用每一个线程的join方法 阻塞当前线程
        tasks.forEach(t->
                {
                    try {
                        t.join();
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                );
//      在此之前  当前线程被阻塞，获取每一个查询线程的结果  加入到res

        tasks.stream().map(FightQuery::get).forEach(res::addAll);

        return res;
    }

    private static FightQueryTask createTask(String fight,String original,String dest){
        return new FightQueryTask(fight,original,dest);
    }
}
