package chapter_8.c_8_5;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:34 2019/12/28
 */
public class Stage {

    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }


}
