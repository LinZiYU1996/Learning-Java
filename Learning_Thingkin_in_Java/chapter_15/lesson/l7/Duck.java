package chapter_15.lesson.l7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 14:43
 * \* Description:
 * \
 */
public class Duck implements Fly{

    private Swing swing = new Swing();

    @Override
    public void fly() {
        swing.fly();
    }

    void swim(){
        System.out.println("I can swim");
    }
}
