package com.bootcamp.bankCredit.repository;


import com.bootcamp.bankCredit.model.entities.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {

  Flux<Credit> findAllByClientIdNumber(String clientIdNumber);

  Mono<Credit> findByClientIdNumber(String clientIdNumber);

  Mono<Credit> findByContractNumber(String contractNumber);

  Integer countByClientIdNumber(String clientIdNumber);


}
