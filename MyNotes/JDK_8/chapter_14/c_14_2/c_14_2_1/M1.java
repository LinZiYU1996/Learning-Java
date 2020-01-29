package JDK_8.chapter_14.c_14_2.c_14_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 14:32
 * \* Description:
 * \
 */
public class M1 {


//    这个方法是这样工作的，它找到 TrainJourney 对象 a 的下一站，将其由表示 a 列表结束的
//null 替换为列表 b （如果 a 不包含任何元素，你需要进行特殊处理）。
    static TrainJourney link(TrainJourney a, TrainJourney b){
        if (a==null) return b;
        TrainJourney t = a;
        while(t.onward != null){
            t = t.onward;
        }
        t.onward = b;
        return a;
    }


    static TrainJourney append(TrainJourney a, TrainJourney b){
            return a==null ? b : new TrainJourney(a.price, append(a.onward, b));
    }


    public static void main(String[] args) {



    }
}
