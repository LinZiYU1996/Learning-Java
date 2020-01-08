package chapter_15.folder.f7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:11
 * \* Description:
 * \
 */
public class Widget {

    public static class Factory implements chapter_15.folder.f7.Factory<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}
