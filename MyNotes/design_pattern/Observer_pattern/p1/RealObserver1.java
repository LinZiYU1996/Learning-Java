package design_pattern.Observer_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/20
 * \* Time: 21:28
 * \* Description:
 * \
 */
public class RealObserver1 implements MyObserver{

// 具体观察者角色1(RealObserver1)

    private String name;

    public RealObserver1(String name) {
        this.name = name;
    }


    @Override
    public void update(String message, String subjectName) {
        System.out.println(name + ":【我收到了来自" + subjectName + "的信息，信息内容为:" + message + "】");
    }
}
