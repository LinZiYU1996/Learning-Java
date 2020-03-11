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


}
