package chapter_15.lesson.l7;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 14:50
 * \* Description:
 * \
 */
public class AppleDecorator implements Basket{

    private Basket basket;

    public AppleDecorator(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void show() {

        basket.show();
        System.out.println("APPLE");
    }
}
