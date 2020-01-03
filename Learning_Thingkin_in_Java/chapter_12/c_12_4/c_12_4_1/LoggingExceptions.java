package chapter_12.c_12_4.c_12_4_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:52 2020/1/3
 */
public class LoggingExceptions {

    public static void main(String[] args) {
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
        try {
            throw new LoggingException();
        } catch(LoggingException e) {
            System.err.println("Caught " + e);
        }
    }


}
