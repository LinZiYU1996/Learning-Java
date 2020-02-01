package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_with_Generic_and_Default_Methods;


@FunctionalInterface
public interface DataCombiner<T> {

    String combine(T t);

}
