package chapter_16.demo.d2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/9
 * \* Time: 15:48
 * \* Description:
 * \
 */
public class ParameterizedArrayType {

    public static void main(String[] args) {

        Integer[] inis = {1,2,3,4,5,6};

        Double[] doubles = {1.1,2.2,3.3,4.4,5.5,6.6};

        Integer[] integers2 =
                new ClassParameter<Integer>().f(inis);


        Double[] doubles2 =
                new ClassParameter<Double>().f(doubles);


        System.out.println(integers2);

        System.out.println(doubles2);

        System.out.println("__________________________");

        integers2 = MethodParameter.f(inis);

        doubles2 = MethodParameter.f(doubles);


        System.out.println(inis);

        System.out.println(doubles);

        System.out.println(integers2);

        System.out.println(doubles2);


    }
}
