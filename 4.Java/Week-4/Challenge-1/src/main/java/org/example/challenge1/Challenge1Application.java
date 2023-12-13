package org.example.challenge1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Challenge1Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		MessageService messageService = context.getBean(MessageService.class);
		
		System.out.println(messageService.getHelloWorldMessage());
	}
}
