package com.github.bernabaris.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StoryConsumerService {

    @KafkaListener(topics = "my_topic", groupId = "story-group")
    public void consume(String message) {
        System.out.println("LOG [Consumer]: New story received from Kafka -> " + message);
    }
}
