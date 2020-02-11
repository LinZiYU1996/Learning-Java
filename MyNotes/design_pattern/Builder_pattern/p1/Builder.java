package design_pattern.Builder_pattern.p1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/2/11
 * \* Time: 10:31
 * \* Description:
 * \
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String s);

    public abstract void makeItems(String[] items);

    public abstract void close();
}
