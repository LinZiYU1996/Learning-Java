package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:43
 * \* Description:
 * \
 */
public class Guardian implements Observer{

    @Override
    public void notify(String tweet) {
        if(tweet != null && tweet.contains("queen")){
            System.out.println("Yet another news in London... " + tweet);
        }
    }
}
