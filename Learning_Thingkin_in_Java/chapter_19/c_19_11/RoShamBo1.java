package chapter_19.c_19_11;

import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 19:49
 * \* Description:
 * \
 */
public class RoShamBo1 {


    static final int SIZE = 20;

    private static Random random = new Random(47);

//    随机出 剪刀石头布
    public static Item newItem(){
        switch (random.nextInt(3)){

            default:

            case 0: return new Scissors();

            case 1: return new Paper();

            case 2: return new Rock();
        }

    }


    public static  void match(Item a,Item b){

        System.out.println(
                a + "vs  " + b + ":  " + a.compete(b)
        );
    }
    public static void main(String[] args) {

//        随机比赛 20次
        for (int i = 0; i < SIZE; i++) {

            match(newItem(),newItem());
        }
    }
}
