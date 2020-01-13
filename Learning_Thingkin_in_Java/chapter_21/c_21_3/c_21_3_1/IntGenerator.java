package chapter_21.c_21_3.c_21_3_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 11:07
 * \* Description:
 * \
 */
public abstract class IntGenerator {

    private volatile boolean canceled = false;

    public abstract int next();


//    修改标志位canceled
    public void cancel(){
        canceled  = true;
    }

//    查看对象是否已经被撤销
    public boolean isCanceled(){
        return canceled;
    }
}
