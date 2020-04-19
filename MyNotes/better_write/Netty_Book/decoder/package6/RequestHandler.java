package better_write.Netty_Book.decoder.package6;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/18
 * \* Time: 10:45
 * \* Description:
 * \
 */
public class RequestHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof RequestParam) {
            RequestParam requestParam = (RequestParam) msg;
            switch (requestParam.getFlag()){
                case 1:
                    System.out.println("this is beat message received msg := " + requestParam.toString());
                    break;
                case 2:
                    System.out.println("this is business message received msg := " + requestParam.toString());
                    break;
                default:
                    System.out.println("error message " + requestParam.toString());
                    break;
            }
        } else {
            System.out.println("error");
        }
    }

}
