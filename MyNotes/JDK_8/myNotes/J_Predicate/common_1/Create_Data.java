package JDK_8.myNotes.J_Predicate.common_1;

import JDK_8.myNotes.J_Predicate.common_3.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/2
 * \* Time: 11:06
 * \* Description:
 * \
 */
public class Create_Data {

    static Random random = new Random(55);

    static String[] origins = new String[]
            {
                    "Beijing","Shanghai","Guangzhou","Shenzheng","Chongqin"
            };

    public static List<Integer> supply_Integers(){

        List<Integer> d = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            d.add(random.nextInt(100));
        }

        return d;
    }

    public static List<Double> supply_Doubles(){

        List<Double> d = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            d.add(random.nextDouble()*100);
        }

        return d;
    }


    public static List<Student> supply_Student(){

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            students.add(new Student(i+"号",random.nextInt(50),random.nextFloat()));
        }

        return students;
    }


    public static List<Person> supply_Persons(){

        List<Person> d = new ArrayList<>();

        for (int i = 0; i < 15; i++) {

            Person person = new Person(i + "号",random.nextInt(100),origins[random.nextInt(origins.length)]);

            d.add(person);

        }

        return d;

    }

    /**
     * 方法1：生成随机数字和字母组合
     * @param length
     * @return
     */

    public static List<String> supply_Strings(int list_len,int length) {

        Random random = new Random();

        StringBuffer valSb = new StringBuffer();

        List<String> strings = new ArrayList<>();

        String charStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int charLength = charStr.length();

        for (int j = 0; j < list_len; j++) {
            for (int i = 0; i < length; i++) {

                int index = random.nextInt(charLength);

                valSb.append(charStr.charAt(index));


            }

            strings.add(valSb.toString());
        }

        return strings;

    }


        public static void main(String[] args) {

//        System.out.println(supply_Persons());

//        System.out.println(supply_Student());

            System.out.println(supply_Strings(1,10));
    }



}
