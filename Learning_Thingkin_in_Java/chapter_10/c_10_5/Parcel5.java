package chapter_10.c_10_5;

import chapter_10.c_10_4.Destination;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:47 2019/12/29
 */
public class Parcel5 {

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;
            private PDestination(String whereTo) {
                label = whereTo;
            }
            public String readLabel() { return label; }
        }
        return new PDestination(s);
    }
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }

}
