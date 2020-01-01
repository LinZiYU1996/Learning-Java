package chapter_10.c_10_7.demo;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:16 2020/1/1
 */
public class Outter {


    protected static class Get_Strings implements GetString{

        private String string;

        public Get_Strings(String string) {
            this.string = string;
        }


        public String get(String s) {
            return string;
        }

        public static void f(){

            System.out.println("Get_Strings  static  f");
        }

        static int x = 10;

        static class Another{

            public static void f(){
                System.out.println("Another f");
            }

            static int x = 10;
        }

    }

    public static GetString getString(String s){
        return new Get_Strings(s);
    }

    public static void main(String[] args) {

        GetString get_strings = getString("HO");

    }

}
