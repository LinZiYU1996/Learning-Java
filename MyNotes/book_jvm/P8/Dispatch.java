package book_jvm.P8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/12
 * \* Time: 10:52
 * \* Description:
 * \
 */
public class Dispatch {

    /*
     单分派 多分派 演示

     */
    static class QQ {

    }

    static class _360 {

    }

    public static class Father {

        public void hardChoice(QQ arg) {
            System.out.println("father choice QQ");
        }

        public void hardChoice(_360 arg) {
            System.out.println("father choice 360");
        }
    }


    public static class Son extends Father {
        public void hardChoice(QQ arg) {
            System.out.println("son choice QQ");
        }

        public void hardChoice(_360 arg) {
            System.out.println("son choice 360");
        }
    }

    public static void main(String[] args) {

        Father father = new Father();

        Father son = new Son();

        father.hardChoice(new _360());

        son.hardChoice(new QQ());

        /*
        father choice 360
        son choice QQ
         */

        /*

        编译阶段编译器的选择过程 静态分派的过程

        选择目标方法有两点:

        1 静态类型是 father 还是 son

        2 方法参数是 qq 还是 360


        这次选择结果的最终产物是产生了两条 invokevirtual 指令

        两条指令的参数分别为 常量池中 指向 father hardchoice（360）

        以及 father hardchoice（qq） 方法的符号引用

        因为是根据两个宗量进行选择  所以Java的静态分派属于多分派类型

        运行时阶段虚拟机的选择:

        动态分派的过程

        执行  son.hardchoice(new qq)时

        由于编译期间已经决定目标方法的签名必须是 hardchoice(qq)

        虚拟机此时不会关系传递过来的参数 到底是 qq

        到底是 腾讯qq 还是 奇瑞qq

        因为这时参数的静态类型  实际类型都对方法的选择不会构成任何影响

        唯一可以影响虚拟机选择的因素的只有此方法的接受者的实际类型是

        father 还是 son

        因为只有一个宗量作为选择依据  所以 Java 的动态分派

        属于  单分派类型






         */




    }
}
