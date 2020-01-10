package chapter_17.demo.d3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/10
 * \* Time: 21:46
 * \* Description:
 * \
 */
public class TreeType extends SetType implements Comparable<TreeType>{

    public TreeType(int i) {
        super(i);
    }

    @Override
    public int compareTo(TreeType o) {
        return (o.i < i ? -1 : (o.i == i ? 0 : 1));
    }
}
