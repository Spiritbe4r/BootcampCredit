package com.bootcamp.bankCredit.controllerCredit;

import com.bootcamp.bankCredit.dto.ClientCreditDto;
import com.bootcamp.bankCredit.service.ClientCreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/api/clientCredit")
public class ClientCreditController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientCreditController.class);
    @Autowired
    private ClientCreditService clientCreditService;
    @GetMapping()
    public Flux<ClientCreditDto> getClients(){
         LOGGER.debug("Search Clients..!");
         return clientCreditService.getClients();
     }
     @GetMapping("/greeting")
     public Mono<String> greet(){return Mono.just("hello world");}
     @PostMapping
    public Mono<ClientCreditDto> saveClientCredit(@RequestBody Mono<ClientCreditDto> clientDtoMono){
         return  clientCreditService.saveClientsCredit(clientDtoMono);
     }
}
