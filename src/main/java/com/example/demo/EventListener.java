package com.example.demo;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class EventListener {
    @StreamListener(Processor.INPUT)
    public void onEventByString(@Payload String productChanged){
        System.out.println("=============================");
        System.out.println(productChanged);
        System.out.println("=============================");
    }
}
