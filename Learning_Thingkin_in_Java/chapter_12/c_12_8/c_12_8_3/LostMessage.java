package chapter_12.c_12_8.c_12_8_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:39 2020/1/3
 */
public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }


}
