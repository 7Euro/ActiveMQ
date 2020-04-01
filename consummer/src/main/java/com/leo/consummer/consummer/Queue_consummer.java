package com.leo.consummer.consummer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

/**
 * @author leo
 * @date 2020/3/31 17:18
 */
@Component
public class Queue_consummer {
    /**
     * 注册一个监听器。destination指定监听的主题。
     * @param textMessage
     * @throws Exception
     */
    @JmsListener(destination = "${myqueue}")
    public void receive(TextMessage textMessage) throws  Exception{
        System.out.println(" ***  消费者收到消息  ***"+textMessage.getText());
    }

}
