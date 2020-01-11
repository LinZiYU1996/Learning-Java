package chapter_17.demo.d8;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/11
 * \* Time: 16:37
 * \* Description:
 * \
 */
public abstract class Test<C> {

    String name;
    public Test(String name) { this.name = name; }
    // Override this method for different tests.
// Returns actual number of repetitions of test.
    abstract int test(C container, TestParam tp);
}
