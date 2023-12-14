package org.example.challenge2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;

public class Challenge2Application {
	
	// The main method is the entry point for the application.
	public static void main(String[] args) {
		// Prompt the user to enter a sentence.
		System.out.println("Veuillez saisir une phrase : ");
		
		// Read the user's input and split it into sentences.
		String[] sentences = readLine();
		
		// Create an ApplicationContext, which is a Spring container that provides configuration for the application.
		// It is initialized with the AppService class, which means that Spring will manage instances of AppService.
		ApplicationContext context = new AnnotationConfigApplicationContext(AppService.class);
		
		// Retrieve an instance of AppService from the ApplicationContext.
		// The getBean() method is used to retrieve beans managed by the Spring container.
		AppService countService = context.getBean(AppService.class);
		
		// Call the countWords method of the AppService instance to get the word counts for each sentence.
		List<Map<String, Integer>> counts = countService.countWords(sentences);
		
		// Loop through the word counts for each sentence and print them.
		for (int i = 0; i < counts.size(); i++) {
			System.out.println("Phrase " + (i + 1) + " : ");
			for (Map.Entry<String, Integer> entry : counts.get(i).entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
	
	// This method reads a line from the console and splits it into sentences.
	public static String[] readLine(){
		Scanner sc = new Scanner(System.in);
		return sc.nextLine().split("[.!?]");
	}
}