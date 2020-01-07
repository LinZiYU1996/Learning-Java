package chapter_15.demo.d4;

import chapter_15.c_15_3.Generator;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:52 2020/1/7
 */
class Customer {

    private static long counter = 1;

    private final long id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Customer" + id;
    }

    public static Generator<Customer> generator(){
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };

    }



}
