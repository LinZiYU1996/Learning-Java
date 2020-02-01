package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_Inheritance;



import java.util.Objects;

@FunctionalInterface
public interface DataReceiver<T> extends DataCombiner<T> {

    default void receive(TaskHandler handler, T t) {
        Objects.requireNonNull(handler);
        handler.get(combine(t));
    }
}
