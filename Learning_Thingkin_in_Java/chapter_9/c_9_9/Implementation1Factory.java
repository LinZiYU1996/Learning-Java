package chapter_9.c_9_9;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:23 2019/12/29
 */
class Implementation1Factory implements ServiceFactory{

    public Service getService() {
        return new Implementation1();
    }


}
