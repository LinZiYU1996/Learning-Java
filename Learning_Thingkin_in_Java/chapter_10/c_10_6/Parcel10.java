package chapter_10.c_10_6;

import chapter_10.c_10_4.Destination;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:09 2019/12/29
 */
public class Parcel10 {

    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if(cost > 100)
                    System.out.println("Over budget!");
            }
            private String label = dest;
            public String readLabel() { return label; }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }

}
