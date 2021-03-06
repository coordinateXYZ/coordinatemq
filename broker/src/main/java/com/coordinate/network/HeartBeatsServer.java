package com.coordinate.network;

import com.coordinate.entity.Broker;
import com.coordinate.utils.FileUtils;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

/**
 * @author dabai_cai
 * @create 2018-07-26 20:13
 */

public class HeartBeatsServer {

    private static Broker broker;
    static {
        broker=FileUtils.loadBroker();
    }


  public static boolean start(){
      boolean success=true;
      EventLoopGroup bossGroup = new NioEventLoopGroup(1);
      EventLoopGroup workerGroup = new NioEventLoopGroup();
      try {
          ServerBootstrap sbs = new ServerBootstrap().group(bossGroup,workerGroup).channel(NioServerSocketChannel.class).handler(new LoggingHandler(LogLevel.INFO)).localAddress(new InetSocketAddress(broker.getPort()))
                  .childHandler(new ChannelInitializer<SocketChannel>() {
                      protected void initChannel(SocketChannel ch) throws Exception {
                          ch.pipeline().addLast(new IdleStateHandler(5, 0, 0, TimeUnit.SECONDS));
                          ch.pipeline().addLast("decoder", new StringDecoder());
                          ch.pipeline().addLast("encoder", new StringEncoder());
                          ch.pipeline().addLast(new HeartBeatServerHandler());
                      };

                  }).option(ChannelOption.SO_BACKLOG, 128)
                  .childOption(ChannelOption.SO_KEEPALIVE, true);
          // 绑定端口，开始接收进来的连接
          ChannelFuture future = sbs.bind(broker.getPort()).sync();
          future.channel().closeFuture().sync();
      } catch (Exception e) {
          success=false;
          bossGroup.shutdownGracefully();
          workerGroup.shutdownGracefully();
      }



      return success;
  }
}


