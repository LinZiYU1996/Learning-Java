package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 22:01
 * \* Description:
 * \
 */
public class Person {

    private int id;
    private String name;
    private String personType;
    public Person(int id, String name, String personType) {
        this.id = id;
        this.name = name;
        this.personType = personType;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPersonType() {
        return personType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personType='" + personType + '\'' +
                '}';
    }
}
