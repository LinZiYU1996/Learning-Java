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
