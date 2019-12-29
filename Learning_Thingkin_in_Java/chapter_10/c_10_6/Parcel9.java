package chapter_10.c_10_6;

import chapter_10.c_10_4.Destination;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:06 2019/12/29
 */
public class Parcel9 {

    // Argument must be final to use inside
// anonymous inner class:
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
    }


}
