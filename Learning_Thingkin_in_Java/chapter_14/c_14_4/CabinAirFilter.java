package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:19 2020/1/4
 */
public class CabinAirFilter extends Filter{


    public static class Factory
            implements chapter_14.c_14_4.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}
