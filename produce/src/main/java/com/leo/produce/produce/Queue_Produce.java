package com.leo.produce.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.UUID;
import javax.jms.Queue;

/**
 * @author leo
 * @date 2020/3/31 16:58
 */
@Component
public class Queue_Produce {
    // JMS模板
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate ;

    // 这个是我们配置的队列目的地
    @Autowired
    private Queue queue ;

    // 发送消息
    public void produceMessage(){
        // 一参是目的地，二参是消息的内容
        jmsMessagingTemplate.convertAndSend(queue,"****"+ UUID.randomUUID().toString().substring(0,6));
    }

    /**
     * 定时任务。每3秒执行一次。非必须代码，仅为演示。
     */
    @Scheduled(fixedDelay = 3000)
    public void produceMessageScheduled(){
        produceMessage();
        System.out.println("*********OK");
    }

}
