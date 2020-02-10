package design_pattern.Prototype_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 21:54
 * \* Description:
 * \
 */
public class UnderlinePen implements Product{

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.println("");
        for (int i = 0; i < len; i++) {
            System.out.println(ulchar);
        }
        System.out.println("");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
