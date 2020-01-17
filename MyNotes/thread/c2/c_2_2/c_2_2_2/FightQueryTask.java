package thread.c2.c_2_2.c_2_2_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 17:44
 * \* Description:
 * \
 */
public class FightQueryTask extends Thread implements FightQuery{

//    获取航空公司数据

    private final String origin;

    private final String destination;

    private final List<String> flightList = new ArrayList<>();

    public FightQueryTask(String airline,String origin,String destination){
        super("[" + airline + "]");
        this.origin = origin;
        this.destination = destination;
    }

    @Override
    public void run() {
        System.out.printf("%s-查询从%s到%s\n",getName(),origin,destination);
        int val = ThreadLocalRandom.current().nextInt(10);
        try {

//            模拟查询的花费的时间
            TimeUnit.SECONDS.sleep(val);
            this.flightList.add(getName() + "---" + val);
            System.out.printf("航班: %s 查询成功\n",getName());
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<String> get() {
        return this.flightList;
    }
}
