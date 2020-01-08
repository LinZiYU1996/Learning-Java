package chapter_15.folder.f7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:09
 * \* Description:
 * \
 */
public class Foo2<T> {

    private T x;

    public <F extends Factory<T>> Foo2(F f){
        x = f.create();
    }

}
