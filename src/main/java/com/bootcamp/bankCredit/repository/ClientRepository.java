package com.bootcamp.bankCredit.repository;

import com.bootcamp.bankCredit.beanCredit.client.ClientCredit;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Configuration
public interface ClientRepository  extends ReactiveMongoRepository<ClientCredit, String> {


}
