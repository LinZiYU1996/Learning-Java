package JDK_8.myNotes.J_Predicate.common_3;



@FunctionalInterface
public interface MyPredicate<T,R,U> {

    boolean test(T t,R r,U u);
}
