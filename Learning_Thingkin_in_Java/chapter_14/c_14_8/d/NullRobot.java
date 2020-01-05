package chapter_14.c_14_8.d;

import chapter_14.c_14_8.Null;

import java.lang.reflect.Proxy;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 18:47 2020/1/5
 */
public class NullRobot {

    public static Robot
    newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{ Null.class, Robot.class },
                new NullRobotProxyHandler(type));
    }
    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for(Robot bot : bots)
            Robot.Test.test(bot);
    }


}
