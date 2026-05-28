package com.araudio.audio_processor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/audio")
public class AudioController {

    private final AudioProducerService producerService;

    // We inject the Producer engine into the Controller
    public AudioController(AudioProducerService producerService) {
        this.producerService = producerService;
    }

    // This creates an endpoint at POST http://localhost:8080/api/v1/audio/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publishAudioEvent(@RequestBody String message) {
        // We tell the engine to fire the message into a topic called "raw-audio-events"
        producerService.sendAudioEvent("raw-audio-events", message);
        
        return ResponseEntity.ok("Message successfully handed off to the Kafka engine!");
    }
}