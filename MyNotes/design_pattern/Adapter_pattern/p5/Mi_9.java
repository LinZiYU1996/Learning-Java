package design_pattern.Adapter_pattern.p5;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/6
 * \* Time: 21:43
 * \* Description:
 * \
 */
public class Mi_9 implements Listen_Type_C{

    @Override
    public void listen_by_type_c() {
        System.out.println("使用type c 接口听歌");

    }
}
