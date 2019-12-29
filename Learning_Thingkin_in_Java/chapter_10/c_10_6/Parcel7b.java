package chapter_10.c_10_6;

import chapter_10.c_10_4.Contents;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 20:51 2019/12/29
 */
public class Parcel7b {

    class MyContents implements Contents {
        private int i = 11;
        public int value() { return i; }
    }
    public Contents contents() { return new MyContents(); }
    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }



}
