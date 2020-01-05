package chapter_15.c_15_6.d;

import chapter_15.c_15_4.c_15_4_3.Generators;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:19 2020/1/5
 */
public class Shelf extends ArrayList<Product> {

    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }


}
