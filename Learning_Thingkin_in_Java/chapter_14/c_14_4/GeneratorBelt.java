package chapter_14.c_14_4;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2020/1/4
 */
public class GeneratorBelt extends Belt{

    public static class Factory
            implements chapter_14.c_14_4.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }


}
