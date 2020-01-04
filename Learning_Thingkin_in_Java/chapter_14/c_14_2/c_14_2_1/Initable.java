package chapter_14.c_14_2.c_14_2_1;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 15:53 2020/1/4
 */
class Initable {

    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }


}
