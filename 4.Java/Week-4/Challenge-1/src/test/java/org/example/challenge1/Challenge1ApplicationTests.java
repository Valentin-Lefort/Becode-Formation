package org.example.challenge1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Challenge1Application.class)
class Challenge1ApplicationTests {
	
	@Autowired
	private MessageService messageService;
	
	@Test
	void testGetHelloWorldMessage() {
		String message = messageService.getHelloWorldMessage();
		assertEquals("Bonjour le monde!", message);
	}
	
}