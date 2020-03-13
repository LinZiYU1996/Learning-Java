package book_jvm.P3;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/11
 * \* Time: 16:40
 * \* Description:
 * \
 */
public class ReferenceCountingGC {


    public Object instance = null;

    private static final  int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    /*

    对象 a 和 b都有字段instance，赋值令a.instance = b;以及b.instance = a
    除此之外，实际上这两个对象已经不可能再被访问了，但是因为它们互相引用对方，导致它们的
    引用计数都不为0，所以GC也回收不了它们

     */
    public static void testGC() {

        ReferenceCountingGC a = new ReferenceCountingGC();

        ReferenceCountingGC b = new ReferenceCountingGC();

        a.instance = b;

        b.instance = a;

        a = null;

        b = null;

        System.gc();
    }


}
