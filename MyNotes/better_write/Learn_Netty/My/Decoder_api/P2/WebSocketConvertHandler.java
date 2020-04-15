package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.handler.codec.http.websocketx.*;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 8:59
 * \* Description:
 * \
 */
public class WebSocketConvertHandler extends MessageToMessageCodec<WebSocketFrame
        ,WebSocketConvertHandler.MyWebSocketFrame> {


    /*
    将 MyWebSocketFrame 编码
    为指定的 WebSocketFrame
    子类型
     */
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, MyWebSocketFrame msg, List<Object> out) throws Exception {
        ByteBuf payload = msg.getData().duplicate().retain();
        switch (msg.getType()) {//实例化一个指定子类型的 WebSocketFrame
            case BINARY:
                out.add(new BinaryWebSocketFrame(payload));
                break;
            case TEXT:
                out.add(new TextWebSocketFrame(payload));
                break;
            case CLOSE:
                out.add(new CloseWebSocketFrame(true, 0, payload));
                break;
            case CONTINUATION:
                out.add(new ContinuationWebSocketFrame(payload));
                break;
            case PONG:
                out.add(new PongWebSocketFrame(payload));
                break;
            case PING:
                out.add(new PingWebSocketFrame(payload));
                break;
            default:
                throw new IllegalStateException(
                        "Unsupported websocket msg " + msg);
        }
    }

    /*
    将 WebSocketFrame 解码为
    MyWebSocketFrame，并设置 FrameType
     */
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, WebSocketFrame msg, List<Object> out) throws Exception {
        ByteBuf payload = msg.content().duplicate().retain();
        if (msg instanceof BinaryWebSocketFrame) {
            out.add(new MyWebSocketFrame(
                    MyWebSocketFrame.FrameType.BINARY, payload));
        } else
        if (msg instanceof CloseWebSocketFrame) {
            out.add(new MyWebSocketFrame (
                    MyWebSocketFrame.FrameType.CLOSE, payload));
        } else
        if (msg instanceof PingWebSocketFrame) {
            out.add(new MyWebSocketFrame (
                    MyWebSocketFrame.FrameType.PING, payload));
        } else
        if (msg instanceof PongWebSocketFrame) {
            out.add(new MyWebSocketFrame (
                    MyWebSocketFrame.FrameType.PONG, payload));
        } else
        if (msg instanceof TextWebSocketFrame) {
            out.add(new MyWebSocketFrame (
                    MyWebSocketFrame.FrameType.TEXT, payload));
        } else
        if (msg instanceof ContinuationWebSocketFrame) {
            out.add(new MyWebSocketFrame (
                    MyWebSocketFrame.FrameType.CONTINUATION, payload));
        } else
        {
            throw new IllegalStateException(
                    "Unsupported websocket msg " + msg);
        }
    }

    /*
    声明 WebSocketConvertHandler
    所使用的 OUTBOUND_IN 类型
     */
    public final static class MyWebSocketFrame {

        /*
        定义拥有被包装的有效
        负载的 WebSocketFrame
        的类型
         */
        public enum FrameType {

            BINARY,
            CLOSE,
            PING,
            PONG,
            TEXT,
            CONTINUATION

        }


        private final FrameType type;

        private final ByteBuf data;

        public MyWebSocketFrame(FrameType type, ByteBuf data) {
            this.type = type;
            this.data = data;
        }


        public FrameType getType() {
            return type;
        }

        public ByteBuf getData() {
            return data;
        }
    }

}
