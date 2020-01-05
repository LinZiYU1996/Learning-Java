package chapter_15.c_15_5;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:16 2020/1/5
 */
public class Customer {

    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}
    public String toString() { return "Customer " + id; }
    // A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            public Customer next() { return new Customer(); }
        };
    }


}
