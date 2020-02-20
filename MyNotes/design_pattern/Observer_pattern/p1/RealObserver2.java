package design_pattern.Observer_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/20
 * \* Time: 21:29
 * \* Description:
 * \
 */
public class RealObserver2 implements MyObserver{


    //具体观察者角色2(RealObserver2)

    private String name;

    public RealObserver2(String name) {
        this.name = name;
    }


    @Override
    public void update(String message, String subjectName) {
        System.out.println(name + ":【我收到了来自" + subjectName + "的信息，信息内容为:" + message + "】");
    }
}
