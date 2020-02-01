package JDK_8.functional_interface.Consumer_Interface_and_forEach_Loop;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/31
 * \* Time: 21:45
 * \* Description:
 * \
 */
public class Note {


    //On this page we will learn Consumer functional Interface and forEach loop introduced in java 8. Consumer functional interface is used as a lambda expression assignment. accept(T t) is functional interface method which accepts only one argument and returns void. The java 8 collection has forEach loop that is called to iterate elements. Java 8 also provides consumer for primitive data types such as IntConsumer, LongConsumer and DoubleConsumer.
    //Instantiate Consumer
    //java.util.function.Consumer is a functional interface. It accepts an input and returns no result. We instantiate it as follows for the given object.
    //Consumer<Student> style = (Student s) -> System.out.println("Name:"+s.name +" and Age:"+s.age);Here Student is a user class.
    //forEach Loop
    //List can be iterated with Consumer argument.
    //list.forEach(style);If the containing class in the collection has a method to print data, we can use forEach as below.
    //list.forEach(Student::printData);Lambda expression can also be used for printing values while iterating over collection using forEach.
    //list.forEach(s -> s.printData());


    


}
