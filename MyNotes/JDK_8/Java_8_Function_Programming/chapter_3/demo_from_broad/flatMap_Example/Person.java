package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.flatMap_Example;

import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 11:47
 * \* Description:
 * \
 */
public class Person {

    Optional<Country> country;
    public Person(){}
    public Person(Optional<Country> country){
        this.country = country;
    }
    public Optional<Country> getCountry() {
        return country;
    }
    public void setCountry(Optional<Country> country) {
        this.country = country;
    }
}
