package JDK_8.chapter_8.c_8_1.c_8_1_2.A1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:11
 * \* Description:
 * \
 */
public class M1 {


    public static void dosomething(Runnable runnable){
        runnable.run();
    }


    public static void dosomething_1(Task task){
        task.execute();
    }


    public static void main(String[] args) {


//        传递一个匿名类实现的 Task ，不会碰到任何问题
        dosomething_1(new Task() {
            @Override
            public void execute() {
                System.out.println("Task");
            }
        });

//        将这种匿名类转换为Lambda表达式时，就导致了一种晦涩的方法调用，因为 Runnable
//和 Task 都是合法的目标类型





    }
}
