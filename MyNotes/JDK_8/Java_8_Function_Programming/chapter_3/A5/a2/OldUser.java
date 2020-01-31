package JDK_8.Java_8_Function_Programming.chapter_3.A5.a2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/30
 * \* Time: 14:55
 * \* Description:
 * \
 */
public class OldUser {

    private String name;

    private int age;

    private String note;

    public OldUser() {
    }

    public OldUser(String name, int age, String note) {
        this.name = name;
        this.age = age;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


    @Override
    public String toString() {
        return "OldUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", note='" + note + '\'' +
                '}';
    }
}
