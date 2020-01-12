package chapter_19.c_19_3;

import static chapter_6.c_6_1.c_6_1_3.Print.print;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:22
 * \* Description:
 * \
 */
public class TrafficLight {

//    switch中使用enum

    Signal color = Signal.RED;


    public void change() {
        switch(color) {
// Note that you don’t have to say Signal.RED
// in the case statement:
            case RED: color = Signal.GREEN;
                break;
            case GREEN: color = Signal.YELLOW;
                break;
            case YELLOW: color = Signal.RED;
                break;
        }
    }


    public String toString() {
        return "The traffic light is " + color;
    }


    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for(int i = 0; i < 7; i++) {
            print(t);
            t.change();
        }
    }

}
