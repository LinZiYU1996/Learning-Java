package chapter_15.lesson.l1;

import chapter_15.bag.b1.b8.Holder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 10:54
 * \* Description:
 * \
 */
public class CaptureConversion {

    static <T> void f1(Holder<T> holder){
        T t = holder.getValue();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder){
        f1(holder);
    }

    public static void main(String[] args) {

        Holder raw = new Holder<Integer>();

        f1(raw);

        f2(raw);

        Holder rasBasic = new Holder();

        rasBasic.setValue(new Object());

        f2(rasBasic);

        Holder<?> wild = new Holder<Double>(1.0);

        f2(wild);

    }
}
