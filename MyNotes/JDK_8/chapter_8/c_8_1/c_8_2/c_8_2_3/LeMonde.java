package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:44
 * \* Description:
 * \
 */
public class LeMonde implements Observer{

    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("wine")){
            System.out.println("Today cheese, wine and news! " + tweet);
        }
    }
}
