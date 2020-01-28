package JDK_8.chapter_9.c_9_3.c_9_3_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 20:33
 * \* Description:
 * \
 */

//需要给出所有抽象方 法的实现，但无需重 复实现默认方法
public class Sun implements Moveable,Rotatable{

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public void setY(int y) {

    }

    @Override
    public void setRotationAngle(int angleInDegrees) {

    }

    @Override
    public int getRotationAngle() {
        return 0;
    }
}
