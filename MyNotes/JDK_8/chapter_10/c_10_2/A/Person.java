package JDK_8.chapter_10.c_10_2.A;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 21:48
 * \* Description:
 * \
 */
public class Person {

//    人可能有车，也可能没//有车，因此将这个字段//声明为 Optional
    private Optional<Car> car;
    public Optional<Car> getCar() { return car; }


}
