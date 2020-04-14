package better_write.Learn_Netty.My.Channel_Handler.P2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;

import java.net.InetSocketAddress;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/4/13
 * \* Time: 10:50
 * \* Description:
 * \
 */
public class T5 {


    public static void main(String[] args) throws InterruptedException {

        //创建 ServerBootstrap 以创建和绑定新的 Channel
        ServerBootstrap bootstrap = new ServerBootstrap();

        //设置 EventLoopGroup，其将提供用以处理 Channel 事件的 EventLoop
        bootstrap.group(new NioEventLoopGroup(),new NioEventLoopGroup()) //指定Channel 的 实现
                .channel(NioServerSocketChannel.class)
                //注册一个ChannelInitializerImpl 的实例来设置 ChannelPipeline
                .childHandler(new ChannelInitializerImpl());

        ChannelFuture future = bootstrap.bind(new InetSocketAddress(8888));

        future.sync();

    }

    //用以设置 ChannelPipeline 的自定义ChannelInitializerImpl 实现
    static final class ChannelInitializerImpl extends ChannelInitializer<Channel> {

        //将所需的ChannelHandler添加到ChannelPipeline
        @Override
        protected void initChannel(Channel channel) throws Exception {
            ChannelPipeline pipeline = channel.pipeline();
            pipeline.addLast(new HttpClientCodec());
            pipeline.addLast(new HttpObjectAggregator(Integer.MAX_VALUE));
        }
    }
}
