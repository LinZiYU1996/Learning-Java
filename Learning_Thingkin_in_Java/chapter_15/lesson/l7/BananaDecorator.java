package chapter_15.lesson.l7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 14:51
 * \* Description:
 * \
 */
public class BananaDecorator implements Basket{

    private Basket basket;


    public BananaDecorator(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void show() {
        basket.show();
        System.out.println("BANANA");
    }
}
