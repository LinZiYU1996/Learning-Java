package JDK_8.functional_interface.Java_Predicate;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 20:00
 * \* Description:
 * \
 */
public class PredicateNotDemo {


    //6. not(Predicate<? super T> target)
    //static <T> Predicate<T> not(Predicate<? super T> target) not is the static method of Predicate introduced in Java 11. not returns predicate that is the negation of supplied predicate. This is accomplished by returning result of the calling target.negate(). Find the example of Predicate.not.


//    public static void main(String[] args) {
//
//        Predicate<Integer> isOdd = n -> n % 2 == 1;
//
//        Predicate<Integer> isEven = Predicate.
//
//        System.out.println(isEven.test(10)); //true
//
//        Predicate<String> isNotHelloMsg = Predicate.not(Predicate.isEqual("Hello"));
//        System.out.println(isNotHelloMsg.test("Hi")); //true
//        System.out.println(isNotHelloMsg.test("Hello")); //false
//    }
}
