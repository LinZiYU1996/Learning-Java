package chapter_19.c_19_1.c_19_1_1;

import chapter_5.c_5_9.Burrito;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/12
 * \* Time: 11:08
 * \* Description:
 * \
 */
public class Buttiyo {

    Spiciness spiciness;

    public Buttiyo(Spiciness spiciness) {
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Buttiyo{" +
                "spiciness=" + spiciness +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(new Buttiyo(Spiciness.NOT));

        System.out.println(new Buttiyo(Spiciness.MEDIUM));

        System.out.println(new Buttiyo(Spiciness.HOT));

    }
}
