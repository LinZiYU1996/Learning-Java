package C_1.c_1_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/13
 * \* Time: 21:54
 * \* Description:
 * \
 */
class Bowl{
    Bowl(int marker){
        System.out.println("Bowl("+marker+")");
    }
    void f1(int marker){
        System.out.println("f1("+marker+")");
    }
}


class Table{

    static Bowl bowl1=new Bowl(1);

    Table(){
        System.out.println("Table()");
        bowl2.f1(1);
    }


    void f2(int marker){
        System.out.println("f2("+marker+")");
    }


    static Bowl bowl2= new Bowl(2);
}


class Cupboard{

    Bowl bowl3=new Bowl(3);

    static Bowl bowl4=new Bowl(4);

    Cupboard(){
        System.out.println("Cupboard()");
        bowl4.f1(2);
    }


    void f3(int marker){
        System.out.println("f3("+marker+")");
    }


    static Bowl bowl5= new Bowl(5);


}

public class StaticInitialization {


//    要执行main()，必须加载StaticInitialization类，然后其静态域table和cupboard被初始化，这导致他们对应的类也被加载，并且由于它们都包含静态的Bowl对象，
//    因此Bowl随后也被加载。这样，在这个特殊的程序中的所有的类在main()开始之前就都被加载了。
//
//    首先从main()函数开始，加载StaticInitializaition类，然后对StaticInitializaition类中的静态域Table进行初始化，加载Table类，Table类中包含静态的Bowl对象，
//    接着加载Bowl类，加载Bowl类构造器创建bowl1对象，输出Bowl(1)，加载Bowl类构造器创建bowl2对象，输出Bowl(2)；同里创建cupboard对象。
//
//    需要注意的是，bowl3是非静态域，每次创建Cupboard对象都会创建一个Bowl对象。
    public static void main(String[] args) {
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        System.out.println("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
