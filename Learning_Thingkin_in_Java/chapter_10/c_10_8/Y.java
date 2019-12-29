package chapter_10.c_10_8;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:54 2019/12/29
 */
class Y implements A{

    B makeB() {
// Anonymous inner class:
        return new B() {};
    }


}
