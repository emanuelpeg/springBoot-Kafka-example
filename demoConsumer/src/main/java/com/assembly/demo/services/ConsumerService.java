package com.assembly.demo.services;

import com.assembly.demo.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${kafka.topicName}", groupId = "demo")
    public void listenGroupDemo(Message message) {
        System.out.println("Received Message in group demo : " + message);
    }
}
