package chapter_15.folder.f8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 20:15
 * \* Description:
 * \
 */
abstract class GenericWithCreate<T> {

    final T element;

    GenericWithCreate() {
        element = create();
    }

    abstract T create();
}
