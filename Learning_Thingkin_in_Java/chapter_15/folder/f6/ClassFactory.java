package chapter_15.folder.f6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:11 2020/1/7
 */
public class ClassFactory<T> {

    T x;

    public ClassFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
