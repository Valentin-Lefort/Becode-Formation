package org.example.challenge3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CmdConfig{
  @Bean
  public HelloCmd getHelloCmd(){
    return new HelloCmd();
  }
  @Bean
  public TimeCmd getTimeCmd(){
    return new TimeCmd();
  }
}