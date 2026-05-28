package com.araudio.audio_processor;

import org.springframework.boot.SpringApplication;

public class TestAudioProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.from(AudioProcessorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
