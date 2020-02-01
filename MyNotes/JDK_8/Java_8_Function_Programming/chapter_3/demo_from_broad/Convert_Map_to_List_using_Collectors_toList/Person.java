package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Convert_Map_to_List_using_Collectors_toList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 10:55
 * \* Description:
 * \
 */
public class Person {

    private Integer id;
    private String name;
    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
