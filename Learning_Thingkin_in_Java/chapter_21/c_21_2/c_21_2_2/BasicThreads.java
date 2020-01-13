package chapter_21.c_21_2.c_21_2_2;

import chapter_21.c_21_2.c_21_2_1.LisstOff;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 21:58
 * \* Description:
 * \
 */
public class BasicThreads {

//    将Runnable对象转变为工作任务的传统方式是把它交给一个Thread构造器
//    Thread构造器只需要调用一个Runnable对象
//    调用thread对象的start方法为该线程执行必须的初始化操作



    public static void main(String[] args) {

        Thread thread = new Thread(new LisstOff());

        thread.start();

        System.out.println("Waiting for LItt");

    }
}
