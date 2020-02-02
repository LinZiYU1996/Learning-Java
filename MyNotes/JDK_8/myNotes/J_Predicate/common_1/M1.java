package JDK_8.myNotes.J_Predicate.common_1;

import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/1
 * \* Time: 21:50
 * \* Description:
 * \
 */
public class M1 {


    public static void main(String[] args) {

        // 判断整型是否大于50
        Predicate<Integer> p1 = integer -> integer > 50;

//        Random random = new Random(55);

        int[] nums = new int[]
                {
                  11,58,6345,5444,0,12,355
                };

        for (int i : nums){
            System.out.println(i + "    是否大于50   " + p1.test(i));
        }

        System.out.println("--------------");

        Predicate<String> p2 = s -> s.length()>5;

        String[] strings = new String[]
                {"jdjfjfjhhu","kkjk","djkjdj","4568","hello"};

        for (String s : strings){
            System.out.println(s + " 长度是否大于5  " + p2.test(s));
        }

        System.out.println("--------------");

        Predicate<String> p3 = s -> s.length() > 3;

        Predicate<String> p4 = s -> s.startsWith("A");

        String[] strings1 = new String[]
                {"Ajdd","2121aA","ajdjdj","af","AAdkdf"};

        for (String s : strings1){
            if (p3.and(p4).test(s)){
                System.out.println(s);
            }
        }

        System.out.println("--------------");

        Predicate<Double> p5 = d -> d > 100;

        double[] doubles = new double[]
                {112.2,54,154,25.36,0,232,25.3};

        for (Double d : doubles) {
            if (p5.negate().test(d)){
                System.out.println(d);
            }
        }

        System.out.println("--------------");

        Predicate<String> p6 = s -> s.length() < 5;

        Predicate<String> p7 = s -> s.endsWith("C");

        String[] strings2 = new String[]
                {"adhaC","aaadefgrgr","d"};

        for (String s : strings2){
            if (p6.or(p7).test(s)){
                System.out.println(s);
            }
        }

        System.out.println("--------------");


        Predicate<String> p8 = Predicate.isEqual("abc");

        System.out.println(p8.test("abc"));

        System.out.println(p8.test("abcasasas"));


    }



}
