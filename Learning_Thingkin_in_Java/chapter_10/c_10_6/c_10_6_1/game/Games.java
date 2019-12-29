package chapter_10.c_10_6.c_10_6_1.game;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:47 2019/12/29
 */
public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move())
            ;
    }
    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }


}
