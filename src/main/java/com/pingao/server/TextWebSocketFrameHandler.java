package com.pingao.server;

import com.pingao.utils.HtmlUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TextWebSocketFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextWebSocketFrameHandler.class);

    private final MarkDownServer server;

    public TextWebSocketFrameHandler(MarkDownServer server) {
        this.server = server;
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof WebSocketServerProtocolHandler.HandshakeComplete) {
            LOGGER.info("Channel {} joined", ctx.channel());
            server.addChannel(ctx.channel());
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }

    @Override
    public void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) {
        msg.retain();
        server.broadcast("/sync", "/test_path", HtmlUtils.markdown2Html(
            HtmlUtils.TEST_MD, Integer.parseInt(msg.text())), Integer.parseInt(msg.text()));
    }
}
