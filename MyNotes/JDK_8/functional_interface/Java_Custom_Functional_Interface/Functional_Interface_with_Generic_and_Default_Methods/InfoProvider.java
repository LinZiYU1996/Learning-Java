package JDK_8.functional_interface.Java_Custom_Functional_Interface.Functional_Interface_with_Generic_and_Default_Methods;


import java.util.Objects;

@FunctionalInterface
public interface InfoProvider<T,R> {

    R provide(T t);

    default InfoProvider<T, R> addMore(ExtraInfoProvider<R> more) {
        return (T t) -> {
            Objects.requireNonNull(more);
            R r = provide(t);
            return more.provideMore(r);
        };
    }

    default DataCombiner<T> addCombiner(DataCombiner<R> combiner) {
        return (T t) -> {
            Objects.requireNonNull(combiner);
            return combiner.combine(provide(t));
        };
    }

    //In the above code we have created an abstract method provide and two defaults methods addMore and addCombiner. The default method addMore is returning InfoProvider, so within addMore we will return a function definition of provide abstract method of InfoProvider functional interface. Objects.requireNonNull checks that the specified object reference is not null.
    //In the addCombiner method, we are returning DataCombiner, so within this method we will return function definition of combine abstract method of DataCombiner functional interface.
}
