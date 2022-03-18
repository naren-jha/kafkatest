package com.jha.kafkatest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void publishToTopic(String message) {
        System.out.println(String.format("publishing to topic %s", KafkaConstants.testTopic));
        kafkaTemplate.send(KafkaConstants.testTopic, message);
    }
}
