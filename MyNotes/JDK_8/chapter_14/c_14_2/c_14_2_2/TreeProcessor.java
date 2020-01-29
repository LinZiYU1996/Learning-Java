package JDK_8.chapter_14.c_14_2.c_14_2_2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/28
 * \* Time: 14:39
 * \* Description:
 * \
 */
public class TreeProcessor {

    public static int lookup(String k, int defaultval, Tree t) {
        if (t == null) return defaultval;
        if (k.equals(t.getKey())) return t.getVal();
        return lookup(k, defaultval,
                k.compareTo(t.getKey()) < 0 ? t.getLeft() : t.getRight());
    }
// 处理Tree的其他方法


    public static void update(String k, int newval, Tree t) {
        if (t == null) { /* 应增加一个新的节点 */ }
//        else if (k.equals(t.getKey())) t.setKey(newval);
        else update(k, newval, k.compareTo(t.getKey()) < 0 ? t.getLeft() : t.getRight());
    }




}
