package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:19 2020/1/4
 */
public class AirFilter extends Filter{

    public static class Factory
            implements chapter_14.c_14_4.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }


}
