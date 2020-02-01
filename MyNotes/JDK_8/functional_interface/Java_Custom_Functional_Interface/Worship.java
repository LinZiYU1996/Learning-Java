package JDK_8.functional_interface.Java_Custom_Functional_Interface;


import java.util.Objects;

@FunctionalInterface
public interface Worship {


    void chant(String name);

    default Worship again(Worship w) {
        return (name) -> {
            Objects.requireNonNull(w);
            chant(name);
            w.chant(name);
        };
    }
}
