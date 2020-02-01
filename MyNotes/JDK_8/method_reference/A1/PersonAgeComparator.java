package JDK_8.method_reference.A1;

import java.util.Comparator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 14:33
 * \* Description:
 * \
 */
public class PersonAgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person a, Person b) {
        return a.getAge().compareTo(b.getAge());

    }
}
