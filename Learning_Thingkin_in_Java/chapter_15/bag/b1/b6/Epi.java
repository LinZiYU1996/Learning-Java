package chapter_15.bag.b1.b6;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/8
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class Epi {

    static <P extends SuperHearing>
    void useSuperHearing(SuperHero<P> hero){
        hero.getP().hearSubtleNoises();
    }

    static <P extends SuperHearing & SuperSmell>
    void superFind(SuperHero<P> hero){
        hero.getP().hearSubtleNoises();
        hero.getP().trackBySmell();
    }

    public static void main(String[] args) {

        DogBoy dogBoy = new DogBoy();

        useSuperHearing(dogBoy);

        superFind(dogBoy);


    }

}
