package com.coordinate.network;/*
Administrator
2018/7/26
Describtion:
Version:1.0v
*/

import com.coordinate.entity.Broker;
import com.coordinate.utils.FileUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;

import java.io.FileNotFoundException;

/**
 * @author dabai_cai
 * @create 2018-07-26 21:12
 */

public class HeartBeatServerHandler extends ChannelInboundHandlerAdapter {

    private int loss_connect_time = 0;
    private static Broker broker;

    static {
        try {
            broker=FileUtils.loadBroker();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent event = (IdleStateEvent) evt;
            if (event.state() == IdleState.READER_IDLE) {
                loss_connect_time++;
                System.out.println("5 秒没有接收到注册机的信息了");
                if (loss_connect_time > 2) {
                    System.out.println("检查注册机是否健在");
                }
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        Broker remoteBrokerInfo=(Broker)msg;
        //TODO 返回响应信息给注册机，下班了！！！！！！！！！！
        ctx.channel().writeAndFlush("");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}