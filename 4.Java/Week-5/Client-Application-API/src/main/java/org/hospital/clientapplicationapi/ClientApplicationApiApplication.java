package org.hospital.clientapplicationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ClientApplicationApiApplication {
  
  public static void main(String[] args) {
    SpringApplication.run(ClientApplicationApiApplication.class, args);
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    Config config = context.getBean(Config.class);
    System.out.println(config.getDoctor(1).block());
    System.out.println(config.postVisitor("Valentrain", "Lefort", 3).block());
  }
  
}
