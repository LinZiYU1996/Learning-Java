package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 10:16
 * \* Description:
 * \
 */
public class T2 {

    public static void main(String[] args) {

        ByteBuf buf = Unpooled.buffer(1);
        int i = buf.refCnt();
        System.err.println("refCnt : " + i);
        buf.retain();
        buf.retain();
        buf.retain();
        buf.retain();
        i = buf.refCnt();
        System.err.println("refCnt : " + i);
        boolean release = buf.release();
        i = buf.refCnt();
        System.err.println("refCnt : " + i + " ===== " + release);      //refCnt : 4 ===== false
        release = buf.release(4);
        i = buf.refCnt();
        System.err.println("refCnt : " + i + " ===== " + release);      //refCnt : 0 ===== true

    }
}
