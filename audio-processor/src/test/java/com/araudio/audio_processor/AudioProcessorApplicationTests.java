package com.araudio.audio_processor;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class AudioProcessorApplicationTests {

	@Test
	void contextLoads() {
	}

}
