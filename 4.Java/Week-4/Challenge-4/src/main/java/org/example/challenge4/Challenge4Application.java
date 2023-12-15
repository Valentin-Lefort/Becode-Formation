package org.example.challenge4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Challenge4Application {
  
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(CmdConfig.class);
    System.out.println("Choose between report or register or exit: ");
    Scanner sc = new Scanner(System.in);
    String cmd = sc.nextLine();
    
    while (!cmd.equals("exit")) {
      if (cmd.equals("report")) {
        System.out.println("Report : ");
        ReportCmd reportCmd = context.getBean(ReportCmd.class);
        reportCmd.run();
      }
      if (cmd.equals("register")) {
        RegisterCmd registerCmd = context.getBean(RegisterCmd.class);
        registerCmd.run();
      }
      System.out.println("Choose between report or register or exit: ");
      cmd = sc.nextLine();
    }
  }
}