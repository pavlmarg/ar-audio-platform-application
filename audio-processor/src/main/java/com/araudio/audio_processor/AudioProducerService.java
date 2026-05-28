package com.araudio.audio_processor;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class AudioProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    // Spring automatically injects the Kafka engine here
    public AudioProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendAudioEvent(String topic, String eventMessage) {
        System.out.println("Sending event to Kafka: " + eventMessage);
        kafkaTemplate.send(topic, eventMessage);
    }
}