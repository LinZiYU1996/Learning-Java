package design_pattern.Mediator_pattenr.p2;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:04
 * \* Description:
 * \
 */
public class VideoCard extends Colleague{


//    同事类——显卡


    /**
     * 构造函授
     * @param mediator
     */
    public VideoCard(Mediator mediator) {
        super(mediator);
        // TODO Auto-generated constructor stub
    }
    /**
     * 显示视频数据
     * @param data
     */
    public void showData(String data) {
        System.out.println("您正在观看的是：" + data);
    }
}
