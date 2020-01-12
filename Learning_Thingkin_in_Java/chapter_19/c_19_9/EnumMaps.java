package chapter_19.c_19_9;

import chapter_19.c_19_8.AlarmPoints;
import static chapter_19.c_19_8.AlarmPoints.*;
import static chapter_6.c_6_1.c_6_1_3.Print.print;
import static chapter_6.c_6_1.c_6_1_3.Print.printnb;

import java.util.EnumMap;
import java.util.Map;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 15:32
 * \* Description:
 * \
 */
public class EnumMaps {

//    EnumMap 是一种特殊的Map  它要求其中的键必须来自于一个enum


    public static void main(String[] args) {

        EnumMap<AlarmPoints,Command> em =
                new EnumMap<AlarmPoints,Command>(AlarmPoints.class);

        em.put(KITCHEN, new Command() {
            public void action() { print("Kitchen fire!"); }
        });

        em.put(BATHROOM, new Command() {
            public void action() { print("Bathroom alert!"); }
        });

        for(Map.Entry<AlarmPoints,Command> e : em.entrySet()) {
            printnb(e.getKey() + ": ");
            e.getValue().action();
        }


        try { // If there’s no value for a particular key:
            em.get(UTILITY).action();
        } catch(Exception e) {
            print(e);
        }


    }
}
