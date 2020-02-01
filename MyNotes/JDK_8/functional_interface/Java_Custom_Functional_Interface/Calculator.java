package JDK_8.functional_interface.Java_Custom_Functional_Interface;


@FunctionalInterface
public interface Calculator {


    //@FunctionalInterface
    //1. @FunctionalInterface annotation is used to create a functional interface.
    //2. A functional interface has exactly one abstract method.
    //3. Default methods of interface are not counted as abstract as they have implementation.
    //4. If functional interface declares an abstract method overriding one of the public methods of Java Object class, that will also not be counted.
    //5. The instances of functional interface can be created by using lambda expressions, method references, or constructor references.
    //Create Functional Interface
    //To create our functional interface, we need to create an interface annotated with @FunctionalInterface and exactly one abstract method. An abstract method within an interface is followed by a semicolon, but no braces.



    long calculate(long num1, long num2);


    //Here we have created Calculator interface with abstract method calculate. The interface Calculator is annotated with @FunctionalInterface and in this way we have created a functional interface i.e. Calculator. We can instantiate a functional interface using lambda expressions, method references, or constructor references.


    //Instantiate Functional Interface using Lambda Expression
    //Here we will instantiate a functional interface using lambda expression. Find the lambda expression syntax.
    //(Argument  part)  -> Body part Now we will instantiate our functional interface Calculator as following.
    //Calculator calc = (n1, n2) -> n1 + n2; In the above lambda expression, number of arguments is two because the abstract method calculate has been defined with two arguments. To get the result, we will call the method of our functional interface.
    //System.out.println(calc.calculate(30, 50)); The output will be 80



}
