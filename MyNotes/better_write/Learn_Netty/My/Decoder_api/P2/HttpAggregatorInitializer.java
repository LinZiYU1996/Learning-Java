package better_write.Learn_Netty.My.Decoder_api.P2;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/14
 * \* Time: 9:21
 * \* Description:
 * \
 */
public class HttpAggregatorInitializer extends ChannelInitializer<Channel> {


    private final boolean isClient;

    public HttpAggregatorInitializer(boolean isClient) {
        this.isClient = isClient;
    }

    @Override
    protected void initChannel(Channel channel) throws Exception {

        ChannelPipeline pipeline = channel.pipeline();

        if (isClient) {
            /*
            如果是客户端，则添
            加 HttpClientCodec
             */
            pipeline.addLast("codec", new HttpClientCodec());
        } else {
            /*
            如果是服务器，则添
            加 HttpServerCodec
             */
            pipeline.addLast("codec", new HttpServerCodec());
        }
        /*
        将最大的消息大小为 512 KB
        的 HttpObjectAggregator 添加
        到 ChannelPipeline
         */
        pipeline.addLast("aggregator",
                new HttpObjectAggregator(512 * 1024));
    }
}
