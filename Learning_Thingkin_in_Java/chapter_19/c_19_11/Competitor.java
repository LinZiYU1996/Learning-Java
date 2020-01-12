package chapter_19.c_19_11;

public interface Competitor<T extends Competitor<T>> {

    Outcome compete(T competitor);
}
