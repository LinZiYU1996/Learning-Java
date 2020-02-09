package design_pattern.Factory_pattern.p5.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/8
 * \* Time: 20:57
 * \* Description:
 * \
 */
public class MyMessageOaTodo extends MyAbstractMessage{

    @Override
    public void sendMesage() throws Exception {
        if (null == getMessageParam()
                || null == getMessageParam().get("OAUSERNAME")
                || "".equals(getMessageParam().get("OAUSERNAME"))) {
            throw new Exception("发送OA待办,需要传入OAUSERNAME参数");// 为了简单起见异常也不自定义了
        }// 这里的参数需求就比较多了不一一处理了

        System.out
                .println("我是OA待办，发送通知给" + getMessageParam().get("OAUSERNAME"));
    }
}
