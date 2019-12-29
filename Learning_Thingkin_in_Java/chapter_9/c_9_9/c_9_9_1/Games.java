package chapter_9.c_9_9.c_9_9_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:29 2019/12/29
 */
public class Games {

    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move())
            ;
    }
    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
