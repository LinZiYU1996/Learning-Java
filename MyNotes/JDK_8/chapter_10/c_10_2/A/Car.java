package JDK_8.chapter_10.c_10_2.A;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 21:49
 * \* Description:
 * \
 */
public class Car {

//    车可能进行了保险，也可//能没有保险，所以将这个//字段声明为 Optional
    private Optional<Insurance> insurance;
    public Optional<Insurance> getInsurance() { return insurance; }
}
