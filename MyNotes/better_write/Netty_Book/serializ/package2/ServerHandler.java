package better_write.Netty_Book.serializ.package2;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/19
 * \* Time: 21:40
 * \* Description:
 * \
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        SubscribeReq req = (SubscribeReq) msg;

        if ("Nike".equalsIgnoreCase(req.getUserName())) {

            System.out.println("service aqccept client subscribe req : ["
            + req.toString()
            + " ]");

            ctx.writeAndFlush(resp(req.getSubReqID()));
        }


    }

    private SubscribeResp resp(int subReqID) {

        SubscribeResp resp = new SubscribeResp();
        resp.setSubReqID(subReqID);
        resp.setRespCode(0);
        resp.setDesc("netty book order success,3 days later send to designa address");
        return resp;
    }
}
