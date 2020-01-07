package chapter_15.demo.d5;

import chapter_15.c_15_10.Apple;
import chapter_15.c_15_10.Orange;
import chapter_15.c_15_2.c_15_2_1.FourTuple;

import java.util.ArrayList;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 17:10 2020/1/7
 */
public class TupleList<A,B,C,D>
        extends ArrayList<FourTuple<A,B,C,D>> {

    public static void main(String[] args) {

        TupleList<Apple, Orange,String,Long> tuples =
                new TupleList<>();


        tuples.add(new
                FourTuple<Apple, Orange,String,Long>(new Apple(),new Orange(),"A,",100L));

//        ,,,当然你可添加更多的数据
        for(FourTuple<Apple, Orange,String,Long> fourTuple : tuples){

            System.out.println(fourTuple);


        }


    }

}
