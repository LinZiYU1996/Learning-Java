package chapter_10.c_10_5.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:21 2020/1/1
 */
public class Outter {

    public GetString getString(String s){

        class GetStrings implements GetString{

            private String string;

            private GetStrings(String string) {
                this.string = string;
            }


            public String get_String() {
                return string;
            }
        }

        return new GetStrings(s);
    }


    public static void main(String[] args) {

        Outter outter = new Outter();

        GetString getString = outter.getString("Hello");

        String s = getString.get_String();

        System.out.println(s);

    }
}
