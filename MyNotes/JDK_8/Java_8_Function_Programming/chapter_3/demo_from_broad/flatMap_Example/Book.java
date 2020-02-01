package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:36
 * \* Description:
 * \
 */
public class Book {

    private int price;
    private String name;
    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
