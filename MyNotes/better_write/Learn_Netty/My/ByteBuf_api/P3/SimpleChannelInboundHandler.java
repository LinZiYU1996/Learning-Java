package better_write.Learn_Netty.My.ByteBuf_api.P3;

import io.netty.channel.ChannelHandlerContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/12
 * \* Time: 11:15
 * \* Description:
 * \
 */
public class SimpleChannelInboundHandler extends io.netty.channel.SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        //不需要任何显式的资源释放
    }
}


