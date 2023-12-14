package org.example.challenge3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Challenge3Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CmdConfig.class);
		HelloCmd helloCmd = context.getBean(HelloCmd.class);
		TimeCmd timeCmd = context.getBean(TimeCmd.class);
		
		Scanner sc = new Scanner(System.in);
		String cmd;
		
		while(true){
			System.out.print("Enter command: ");
			cmd = sc.nextLine();
			if(cmd.equals("hello")){
				helloCmd.execute();
			}
			else if(cmd.equals("time")){
				timeCmd.execute();
			}
			else if(cmd.equals("exit")){
				break;
			}
			else{
				System.out.println("Invalid command");
			}
		}
	}
}
