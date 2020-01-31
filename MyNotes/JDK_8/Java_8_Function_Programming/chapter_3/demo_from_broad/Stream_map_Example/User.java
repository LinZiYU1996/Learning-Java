package JDK_8.Java_8_Function_Programming.chapter_3.demo_from_broad.Stream_map_Example;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 21:57
 * \* Description:
 * \
 */
public class User {

    private int id;
    private String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
