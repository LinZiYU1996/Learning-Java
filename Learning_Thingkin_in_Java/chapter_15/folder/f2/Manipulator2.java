package chapter_15.folder.f2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:17 2020/1/7
 */
public class Manipulator2<T extends HasF> {

    private T obj;

    public Manipulator2(T obj) {
        this.obj = obj;
    }

    public void  manipulator2(){
        obj.f();
    }
}
