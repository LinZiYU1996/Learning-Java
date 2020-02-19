package design_pattern.Mediator_pattenr.p2;



/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:03
 * \* Description:
 * \
 */
public class CDDriver extends Colleague{


//    同事类——光驱


    /**
     * 光驱读取出来的数据
     */
    private String data = "";
    /**
     * 构造函数
     * @param mediator
     */
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    /**
     * 获取光盘读取出来的数据
     * @return
     */
    public String getData() {
        return data;
    }
    /**
     * 读取光盘
     */
    public void readCD() {
        //逗号前是视频显示的数据，逗号后是声音
        this.data = "One Piece, 海贼王我当定了";
        //通知主板，自己的状态发生了改变
        getMediator().changed(this);
    }


}
