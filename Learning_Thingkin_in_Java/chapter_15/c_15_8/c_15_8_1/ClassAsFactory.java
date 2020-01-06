package chapter_15.c_15_8.c_15_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:23 2020/1/6
 */
public class ClassAsFactory<T> {

    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}
