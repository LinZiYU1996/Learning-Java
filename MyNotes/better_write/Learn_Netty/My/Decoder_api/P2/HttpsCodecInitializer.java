package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslHandler;

import javax.net.ssl.SSLEngine;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 9:27
 * \* Description:
 * \
 */
public class HttpsCodecInitializer extends ChannelInitializer<Channel> {

    private final SslContext context;

    private final boolean isClient;

    public HttpsCodecInitializer(SslContext context, boolean isClient) {
        this.context = context;
        this.isClient = isClient;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {

        ChannelPipeline pipeline = channel.pipeline();
        SSLEngine engine = context.newEngine(channel.alloc());

        /*
        将 SslHandler 添加到ChannelPipeline 中以使用 HTTPS
         */
        pipeline.addFirst("ssl", new SslHandler(engine));
        if (isClient) {
            /*
            如果是客户端，则添加 HttpClientCodec
             */
            pipeline.addLast("codec", new HttpClientCodec());
        } else {
            /*
            如果是服务器，则添加 HttpServerCodec
             */
            pipeline.addLast("codec", new HttpServerCodec());
        }


    }
}
