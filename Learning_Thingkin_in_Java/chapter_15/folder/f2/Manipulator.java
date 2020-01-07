package chapter_15.folder.f2;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:10 2020/1/7
 */
public class Manipulator<T> {

    private T obj;

    public Manipulator(T obj) {
        this.obj = obj;
    }

//    ERROR
    public void manipulator(){
//        obj.f();
    }
}
