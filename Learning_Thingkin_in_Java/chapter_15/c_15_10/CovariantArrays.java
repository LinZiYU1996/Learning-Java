package chapter_15.c_15_10;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:20 2020/1/6
 */
public class CovariantArrays {

    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
// Runtime type is Apple[], not Fruit[] or Orange[]:
        try {
// Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }
        try {
// Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch(Exception e) { System.out.println(e); }
    }

}
