package chapter_15.c_15_6.d;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:20 2020/1/5
 */
//零售店
public class Store extends ArrayList<Aisle> {

    private ArrayList<CheckoutStand> checkouts =
            new ArrayList<CheckoutStand>();


    private Office office = new Office();

//    构造函数
    public Store(int nAisles, int nShelves, int nProducts) {
        for(int i = 0; i < nAisles; i++)
            add(new Aisle(nShelves, nProducts));
    }

//String格式
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Aisle a : this)
            for(Shelf s : a)
                for(Product p : s) {
                    result.append(p);
                    result.append("\n");
                }
        return result.toString();
    }
    public static void main(String[] args) {


        System.out.println(new Store(14, 5, 10));
    }
}
