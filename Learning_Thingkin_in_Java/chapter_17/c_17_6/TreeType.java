package chapter_17.c_17_6;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 19:51 2020/1/6
 */
public class TreeType extends SetType
        implements Comparable<TreeType>{

    public TreeType(int n) { super(n); }
    public int compareTo(TreeType arg) {
        return (arg.i < i ? -1 : (arg.i == i ? 0 : 1));
    }
}
