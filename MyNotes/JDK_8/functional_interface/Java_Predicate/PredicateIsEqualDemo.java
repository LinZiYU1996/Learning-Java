package JDK_8.functional_interface.Java_Predicate;


import java.util.function.Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 19:54
 * \* Description:
 * \
 */
public class PredicateIsEqualDemo {


    //5. isEqual(Object targetRef)
    //static <T> Predicate<T> isEqual(Object targetRef) isEqual is the static method of Predicate that returns the predicate that tests if two arguments are equal according to Objects.equals(Object, Object). We create predicate using Predicate.isEqual as following.
    //Predicate<String> isHelloMsg = Predicate.isEqual("Hello");
    //Predicate<Book> isMahabharatBook = Predicate.isEqual(new Book("Mahabharat", "Vyas"));


    public static void main(String[] args) {

        System.out.println("---Testing Hello message---");

        Predicate<String> predicate1 = Predicate.isEqual("hello");

        System.out.println(predicate1.test("hello"));
        System.out.println(predicate1.test("Hi"));  //false

        System.out.println("");
        System.out.println("---Testing Mahabharat book---");
        Book mahabharatBook = new Book("Mahabharat", "Vyas");

        Predicate<Book> predicate2 = Predicate.isEqual(mahabharatBook);

        System.out.println(predicate2.test(new Book("Mahabharat", "Vyas"))); //true
        System.out.println(predicate2.test(new Book("Ramayan", "Valmiki"))); //true
    }
}
