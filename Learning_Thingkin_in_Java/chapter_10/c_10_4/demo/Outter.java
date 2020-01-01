package chapter_10.c_10_4.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:01 2020/1/1
 */
public class Outter {


    private class GetStrings implements GetString{

        private String string;

        private GetStrings(String string) {
            this.string = string;
        }


        public String getString() {
            return string;
        }
    }

    protected class GetValues implements GetValue{

        private int anInt;

        public int getValue() {
            return anInt;
        }
    }

    public GetString getString(String s){
        return new GetStrings(s);
    }

    public GetValue getValue(){
        return new GetValues();
    }

}
