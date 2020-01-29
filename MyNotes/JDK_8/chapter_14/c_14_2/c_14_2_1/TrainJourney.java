package JDK_8.chapter_14.c_14_2.c_14_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 14:32
 * \* Description:
 * \
 */
public class TrainJourney {


//    可变类 TrainJourney （利用一
//个简单的单向链接列表实现）表示从A地到B地的火车旅行
    public int price;
    public TrainJourney onward;
    public TrainJourney(int p, TrainJourney t) {
        price = p;
        onward = t;
    }


}
