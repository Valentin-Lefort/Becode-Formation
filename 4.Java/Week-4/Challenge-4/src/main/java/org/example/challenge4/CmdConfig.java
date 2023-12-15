package org.example.challenge4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CmdConfig {
  @Bean
  @Scope("singleton")
  public ReportCmd getReportCmd() {
    return new ReportCmd();
  }
  
  @Bean
  @Scope("prototype")
  public RegisterCmd getRegisterCmd() {
    return new RegisterCmd(getReportCmd());
  }
}