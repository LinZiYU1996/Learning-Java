package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_4;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:59
 * \* Description:
 * \
 */
public abstract class ProcessingObject<T> {


//    在抽象类中会定义一个字//段来记录后续对象。一旦对象完成它的工作，处理对象就会将它的工作转交给它的后继
    protected ProcessingObject<T> successor;


    public void setSuccessor(ProcessingObject<T> successor){

        this.successor = successor;

    }

// handle 方法提供了如何进行
//工作处理的框架。不同的处理对象可以通过继承 ProcessingObject 类，提供 handleWork 方法
//来进行创建。
    public T handle(T input){


        T r = handleWork(input);

        if(successor != null){
            return successor.handle(r);
        }

        return r;
    }

    abstract protected T handleWork(T input);


}
