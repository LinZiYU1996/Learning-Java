package chapter_15.demo.d4;

import chapter_15.c_15_4.c_15_4_3.Generators;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:57 2020/1/7
 */
public class BankTeller {


    public static void serve(Teller teller, Customer customer){

        System.out.println(teller + "服务" + customer);

    }

    public static void main(String[] args) {

        Random random = new Random(47);

        Queue<Customer> line = new LinkedList<>();

//        用Customer生成器往line中填充20个Customer对象
        Generators.fill(line,Customer.generator(),20);

        List<Teller> tellers = new ArrayList<>();
        //同上
        Generators.fill(tellers,Teller.generator,3);


//        从tellers集合随机选择一个Teller为Customer服务
        for (Customer customer :line) {
            serve(tellers.get(random.nextInt(tellers.size())),customer);
        }


    }

}
