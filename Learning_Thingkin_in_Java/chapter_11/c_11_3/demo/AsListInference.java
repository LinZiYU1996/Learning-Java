package chapter_11.c_11_3.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:15 2020/1/2
 */
public class AsListInference {


    public static void main(String[] args) {

        List<Car> c1 = Arrays.asList(
                new CarUseElec(),new CarUseGas()
        );

//        不会编译

        List<Car> c2 = Arrays.asList(
                new Audi(),new BMW()
        );

        List<Car> c3 = new ArrayList<Car>();

        Collections.addAll(c3,new Audi(),new TesLa());

        List<Car> c4 = Arrays.<Car>asList(
                new Audi(),new TesLa()
        );

//        System.out.println(c2.get(0).getClass());


    }

}
