package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2020/1/4
 */
public class FanBelt extends Belt{

    public static class Factory
            implements chapter_14.c_14_4.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }


}
