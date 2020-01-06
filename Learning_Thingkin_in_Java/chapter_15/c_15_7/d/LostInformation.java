package chapter_15.c_15_7.d;

import java.util.*;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:16 2020/1/5
 */
public class LostInformation {


    public static void main(String[] args) {

        List<Frob> list = new ArrayList<Frob>();

        Map<Frob,Fnorkle> map = new HashMap<Frob,Fnorkle>();

        Quark<Fnorkle> quark = new Quark<Fnorkle>();

        Particle<Long,Double> p = new Particle<Long,Double>();


        System.out.println(Arrays.toString(
                list.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(
                map.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(
                quark.getClass().getTypeParameters()));

        System.out.println(Arrays.toString(
                p.getClass().getTypeParameters()));
    }


}
