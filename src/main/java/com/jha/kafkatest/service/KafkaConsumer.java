package com.jha.kafkatest.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    
    @KafkaListener(topics=KafkaConstants.testTopic, groupId="mygroup")
    public void consumeFromTopic(String message) {
        System.out.println(String.format("Received message from topic %s = %s", KafkaConstants.testTopic, message));
    }

}
