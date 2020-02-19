package design_pattern.Mediator_pattenr.p2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/19
 * \* Time: 21:06
 * \* Description:
 * \
 */
public class Main {


    public static void main(String[] args) {
        // 创建调停者 -- 主板
        MainBoard mediator = new MainBoard();
        // 创建同事类
        CDDriver cdDriver = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard videoCard = new VideoCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        // 让调停者知道所有同事
        mediator.setCdDriver(cdDriver);
        mediator.setCpu(cpu);
        mediator.setSoundCard(soundCard);
        mediator.setVideoCard(videoCard);
        // 开始看电影，把光盘放入光驱，光驱开始读盘
        cdDriver.readCD();

    }
}
