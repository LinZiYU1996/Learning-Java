package JDK_8.chapter_8.c_8_1.c_8_2.c_8_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/27
 * \* Time: 16:28
 * \* Description:
 * \
 */
public class Validator {

    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }


    public boolean validate(String s){
        return strategy.execute(s);
    }

    public static void main(String[] args) {

        Validator numericValidator = new Validator(new IsNumeric());

        boolean b1 = numericValidator.validate("aaaa");

        System.out.println(b1);

        System.out.println("======================================");

        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());

        boolean b2 = lowerCaseValidator.validate("bbbb");

        System.out.println(b2);


        System.out.println("======================================");

//        使用Lambda表达式

        Validator numericValidator_1 =

                new Validator(
                        (String s) ->

                            s.matches("[a-z]+")

                );

        boolean b1_1 = numericValidator.validate("aaaa");


        Validator lowerCaseValidator_1 =

                new Validator(

                        (String s) ->

                            s.matches("\\d+")

                );

        boolean b2_1 = lowerCaseValidator_1.validate("bbbb");


    }
}
