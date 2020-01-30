package JDK_8.Java_8_Function_Programming.chapter_3.A2.a1;

import java.math.BigDecimal;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 21:23
 * \* Description:
 * \
 */
public class User {

    private String name;
    private int price;
    private BigDecimal salary;


    public User(String name, int price, BigDecimal salary) {
        this.name = name;
        this.price = price;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", salary=" + salary +
                '}';
    }
}
