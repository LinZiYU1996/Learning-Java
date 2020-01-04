package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:18 2020/1/4
 */
public class FuelFilter extends Filter{

    // Create a Class Factory for each specific type:
    public static class Factory
            implements chapter_14.c_14_4.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }


}
