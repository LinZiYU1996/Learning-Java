package jvm.ji_ke_shi_jian.p2;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/16
 * \* Time: 17:21
 * \* Description:
 * \
 */
public class BadBussiness extends Bussiness{


    @Override
    public double price_cut(double origanl_price, Custom c) {

        if (c.isVIP()){// invokeinterface
            return origanl_price * price_judice(); // invokesatic
        } else {
            return super.price_cut(origanl_price,c);// invokespecial
        }

    }

    public static double price_judice(){
        return new Random()// invokespecial
                .nextDouble() // invokevirtual
                + 0.8d;
    }
}
