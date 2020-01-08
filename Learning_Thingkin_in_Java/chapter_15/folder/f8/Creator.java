package chapter_15.folder.f8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:16
 * \* Description:
 * \
 */
public class Creator extends GenericWithCreate<X> {

    X create(){
        return new X();
    }

    void f(){
        System.out.println(element.getClass().getSimpleName());
    }


}
