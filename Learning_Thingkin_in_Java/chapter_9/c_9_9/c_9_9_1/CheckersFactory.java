package chapter_9.c_9_9.c_9_9_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:28 2019/12/29
 */
class CheckersFactory implements GameFactory{

    public Game getGame() { return new Checkers(); }


}
