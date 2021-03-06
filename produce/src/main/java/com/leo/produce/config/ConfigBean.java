package com.leo.produce.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;
import javax.jms.Queue;


/**
 * @author leo
 * @date 2020/3/31 16:51
 */
@Component
@EnableJms
public class ConfigBean {

    @Value("${myqueue}")
    private String myQueue;

    @Bean
    public Queue queue(){
        return  new ActiveMQQueue(myQueue);
    }

}



