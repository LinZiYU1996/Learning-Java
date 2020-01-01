package chapter_10.c_10_6.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:33 2020/1/1
 */
public class Outter {


    public GetVal getInner(){
        return new GetVal() {

            private int anInt = 1001;
            public int get_Val() {
                return anInt;
            }
        };

    }


    public static void main(String[] args) {

        Outter outter = new Outter();

        GetVal getVal = outter.getInner();

        System.out.println(getVal.get_Val());
    }

}
