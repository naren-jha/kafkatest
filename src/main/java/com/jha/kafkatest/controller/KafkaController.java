package com.jha.kafkatest.controller;

import com.jha.kafkatest.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaApp")
public class KafkaController {

    @Autowired
    private KafkaProducer kafkaProducer;
    
    @PostMapping("/push")
    public void sendMessage(@RequestParam("msg") String msg) {
        kafkaProducer.publishToTopic(msg);
    }

}