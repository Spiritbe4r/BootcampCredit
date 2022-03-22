package com.bootcamp.bankCredit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;


@EnableEurekaClient
@SpringBootApplication
public class BankCreditApplication {

  @Value("${microservice-client.uri}")
  private String microserviceClientUrl;

  @Bean
  public WebClient webClient(WebClient.Builder builder) {
    return builder
          .baseUrl(microserviceClientUrl)
          .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
          .build();
  }

  public static void main(String[] args) {
    SpringApplication.run(BankCreditApplication.class, args);
  }

}
