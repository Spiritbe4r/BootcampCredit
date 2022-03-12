package com.bootcamp.bankCredit.service;

import com.bootcamp.bankCredit.dto.ClientCreditDto;
import com.bootcamp.bankCredit.repository.ClientRepository;
import com.bootcamp.bankCredit.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class ClientCreditService {

    @Autowired
    private ClientRepository clientRepository;

    public Flux<ClientCreditDto> getClients(){
        return clientRepository.findAll().map(AppUtils::entityToDto);
    }
    public Mono<ClientCreditDto> saveClientsCredit(Mono<ClientCreditDto> clientDtoMono){
        return clientDtoMono.map(AppUtils::DtoToEntity)
                .flatMap(clientRepository::insert)
                .map(AppUtils::entityToDto);
    }


}
