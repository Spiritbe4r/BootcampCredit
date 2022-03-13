package com.bootcamp.bankCredit.repository;


import com.bootcamp.bankCredit.model.entities.Credit;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CreditRepository extends ReactiveMongoRepository<Credit, String> {

    Flux<Credit> findAllByClientIdNumber(String customerIdentityNumber);
    Mono<Credit> findByClientIdNumber(String customerIdentityNumber);
    Mono<Credit> findByContractNumber(String contractNumber);


}
