package chapter_12.c_12_8.c_12_8_3;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:39 2020/1/3
 */
public class ExceptionSilencer {

    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
// Using ‘return’ inside the finally block
// will silence any thrown exception.
            return;
        }
    }


}
