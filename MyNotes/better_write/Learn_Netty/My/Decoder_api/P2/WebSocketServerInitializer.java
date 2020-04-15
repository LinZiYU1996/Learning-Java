package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.ContinuationWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 9:32
 * \* Description:
 * \
 */
public class WebSocketServerInitializer extends ChannelInitializer<Channel> {


    @Override
    protected void initChannel(Channel channel) throws Exception {

        channel.pipeline()
                .addLast(
                        new HttpServerCodec(),
                        /*
                        为握手提供聚合的HttpRequest
                         */
                        new HttpObjectAggregator(65536),
                        /*
                        如果被请求的端点是"/websocket"，则处理该升级握手
                         */
                        new WebSocketServerProtocolHandler("/websocket"),

                        /*
                        TextFrameHandler 处理TextWebSocketFrame
                         */
                        new TextFrameHandler(),

                        /*
                        BinaryFrameHandler处理BinaryWebSocketFrame
                         */
                        new BinaryFrameHandler(),

                        /*
                        ContinuationFrameHandler 处理ContinuationWebSocketFrame
                         */
                        new ContinuationFrameHandler()
                );


    }

    public static final class TextFrameHandler extends
            SimpleChannelInboundHandler<TextWebSocketFrame> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx,
                                 TextWebSocketFrame msg) throws Exception {
// Handle text frame
        }
    }



    public static final class BinaryFrameHandler extends
            SimpleChannelInboundHandler<BinaryWebSocketFrame> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx,
                                 BinaryWebSocketFrame msg) throws Exception {
// Handle binary frame
        }
    }
    public static final class ContinuationFrameHandler extends
            SimpleChannelInboundHandler<ContinuationWebSocketFrame> {
        @Override
        public void channelRead0(ChannelHandlerContext ctx,
                                 ContinuationWebSocketFrame msg) throws Exception {
// Handle continuation frame
        }
    }

}

