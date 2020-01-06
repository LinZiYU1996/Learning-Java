package chapter_15.c_15_5;

import chapter_15.c_15_4.c_15_4_3.Generators;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:17 2020/1/5
 */
public class BankTeller {

    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

//    Customer和Teller类都只有private的构造器，这可以强制你必须使用Generator对象。
//    Customer有一个generator()方法，每次执行它都会生成一个新的Generator<Customer>对象。
//    我们其实不蒂要多个Generator对象，Teller就只创建了一个public的generator对象。
//    在main()方法中可以看到，这两种创建Generator的方式都在fill()中用到了。
//由于Customer中的generator()方法，以及Teller中的Generator对象都声明成了static的，
// 所以它们无法作为接口的一部分，因此无法用接口这种特定的惯用法来泛化这二者。尽管如此，
// 它们在血O方法中都工作得很好。
    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);

        for(Customer c : line)
            serve(tellers.get(rand.nextInt(tellers.size())), c);
    }
}
