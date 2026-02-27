package com.github.bernabaris.producer.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
public class KafkaProducerController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC = "my_topic";

    public KafkaProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/publish")
    public String sendMessage(@RequestParam("message") String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent to Kafka: " + message;
    }
}
