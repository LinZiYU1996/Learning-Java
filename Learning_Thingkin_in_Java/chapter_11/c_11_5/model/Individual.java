package chapter_11.c_11_5.model;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 14:58 2020/1/2
 */
public class Individual {

    private static long counter = 0;

    private final long id = counter++;

    private String name;

    public long id(){
        return id;
    }

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                (name == null ? "" : " " + name);
    }
}
