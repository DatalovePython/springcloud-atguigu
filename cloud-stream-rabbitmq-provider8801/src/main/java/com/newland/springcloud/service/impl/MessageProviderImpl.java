package com.newland.springcloud.service.impl;

import com.newland.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author luzc
 * @date 2020/12/30 11:09
 * @desc
 */
// 定义一个消息生产者的推送管道（消息源你  ）
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    // 依赖注入
    @Resource
    private MessageChannel output; // 消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("******serial:" + serial);
        return null;
    }
}
