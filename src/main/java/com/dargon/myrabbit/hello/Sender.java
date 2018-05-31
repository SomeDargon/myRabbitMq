package com.dargon.myrabbit.hello;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

//    @Scheduled(fixedDelay = 1000L)
    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("foo", context);
    }
}
