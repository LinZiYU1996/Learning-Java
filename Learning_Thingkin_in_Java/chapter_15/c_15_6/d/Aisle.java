package chapter_15.c_15_6.d;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:19 2020/1/5
 */
//走廊
public class Aisle extends ArrayList<Shelf> {

    public Aisle(int nShelves, int nProducts) {

        for(int i = 0; i < nShelves; i++)
            add(new Shelf(nProducts));
    }


}
