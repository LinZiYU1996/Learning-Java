package chapter_10.c_10_8.c_10_8_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:59 2019/12/29
 */
class Caller {

    private Incrementable callbackReference;
    Caller(Incrementable cbh) { callbackReference = cbh; }
    void go() { callbackReference.increment(); }


}
