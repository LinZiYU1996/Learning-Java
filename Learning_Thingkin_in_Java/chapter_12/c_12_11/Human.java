package chapter_12.c_12_11;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 16:50 2020/1/3
 */
public class Human {

    public static void main(String[] args) {
// Catch the exact type:
        try {
            throw new Sneeze();
        } catch(Sneeze s) {
            System.out.println("Caught Sneeze");
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
// Catch the base type:
        try {
            throw new Sneeze();
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
        }
    }
}
