package org.hospital.clientapplicationapi;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class Config {
  private final WebClient webClient;
  
  public Config () {
    this.webClient = WebClient.create("http://localhost:8080");
  }
  public Mono<String> getDoctor(int id) {
    return this.webClient.get().uri("/api/doctors/{id}", id).retrieve().bodyToMono(String.class);
  }
  
  public Mono<String> postVisitor(String firstName, String lastName, int doctorId){
    return this.webClient.post().uri("http://localhost:8080/api/visits?firstName={firstName}&lastName={lastName}&doctorId={id}",
            firstName, lastName, doctorId).retrieve().bodyToMono(String.class);
  }
}
