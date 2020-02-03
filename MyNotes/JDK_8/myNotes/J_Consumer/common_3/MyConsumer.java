package JDK_8.myNotes.J_Consumer.common_3;

@FunctionalInterface
public interface MyConsumer<T,R,U> {

    void accept(T t,R r,U u);
}
