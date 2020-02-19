package design_pattern.Mediator_pattenr.p2;


/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:05
 * \* Description:
 * \
 */
public class SoundCard extends Colleague{

//    同事类——声卡


    /**
     * 构造函数
     *
     * @param mediator
     */
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    /**
     * 按照声频数据发出声音
     * @param data
     */
    public void soundData(String data) {
        System.out.println("画外音：" + data);
    }
}
