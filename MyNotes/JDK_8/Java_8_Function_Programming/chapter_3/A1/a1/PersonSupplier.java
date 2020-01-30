package JDK_8.Java_8_Function_Programming.chapter_3.A1.a1;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:13
 * \* Description:
 * \
 */
public class PersonSupplier implements Supplier<PersonDto> {


    private int index = 0;

    private Random random = new Random();

    @Override
    public PersonDto get() {
        return new PersonDto("lin" + index,index++,random.nextDouble());
    }


    public static void main(String[] args) {

        Stream.generate(new PersonSupplier())
                .limit(15)
                .forEach( personDto ->
                        System.out.println(personDto.getName()+"  "
                        + personDto.getAge()+"   " +
                                personDto.getHeight()));

    }
}
