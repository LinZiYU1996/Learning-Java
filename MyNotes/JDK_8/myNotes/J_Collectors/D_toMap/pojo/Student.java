package JDK_8.myNotes.J_Collectors.D_toMap.pojo;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/3
 * \* Time: 22:16
 * \* Description:
 * \
 */
public class Student {


    static private Random random = new Random();

    static private DecimalFormat df = new DecimalFormat("0.00");

    private int id;

    private String name;

    private int age;

    private int G_math;

    private int G_english;

    private int G_chinese;


    public Student(int id, String name, int age, int g_math, int g_english, int g_chinese) {
        this.id = id;
        this.name = name;
        this.age = age;
        G_math = g_math;
        G_english = g_english;
        G_chinese = g_chinese;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", G_math=" + G_math +
                ", G_english=" + G_english +
                ", G_chinese=" + G_chinese +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getG_math() {
        return G_math;
    }

    public void setG_math(int g_math) {
        G_math = g_math;
    }

    public int getG_english() {
        return G_english;
    }

    public void setG_english(int g_english) {
        G_english = g_english;
    }

    public int getG_chinese() {
        return G_chinese;
    }

    public void setG_chinese(int g_chinese) {
        G_chinese = g_chinese;
    }

    public static int computeGPA(Student student){
        return (student.getG_chinese() + student.getG_english() + student.getG_math()) / 3;
    }

    public static List<Student> supple_S(){
        List<Student> d = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            d.add(new Student(i,i+"号学生",random.nextInt(25),random.nextInt(100),random.nextInt(100),random.nextInt(100)));
        }

        return d;

    }




    public static void main(String[] args) {

        supple_S().stream()
                .forEach(System.out::println);

    }
}
