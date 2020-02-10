package design_pattern.Prototype_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/9
 * \* Time: 21:52
 * \* Description:
 * \
 */
public class MessageBox implements Product{

    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int len = s.getBytes().length;

        for (int i = 0; i <len+4 ; i++) {
            System.out.println(decochar);
        }
        System.out.println("");
        System.out.println(decochar+" " + s + " " + decochar);
        for (int i = 0; i <len+4 ; i++) {
            System.out.println(decochar);
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
