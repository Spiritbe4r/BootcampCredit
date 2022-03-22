package com.bootcamp.bankCredit.service;

import com.bootcamp.bankCredit.model.dto.Client;
import com.bootcamp.bankCredit.model.entities.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CreditService extends CrudService<Credit, String> {

  /**
   * Get credit .
   *
   * @param contractNumber the contract identity number
   * @return the contract
   */
  Mono<Credit> findByContractNumber(String contractNumber);

  /**
   * Gets clients.
   *
   * @param clientIdNumber the client identity number
   * @return the client
   */
  Mono<Client> getClient(String clientIdNumber);

  /**
   * Find all by client identity number flux.
   *
   * @param clientIdNumber the client identity number
   * @return the flux
   */
  Flux<Credit> findAllByClientIdNumber(String clientIdNumber);

  /**
   * Validate client identity number mono.
   *
   * @param clientIdNumber the client identity number
   * @return the mono
   */
  Mono<Credit> validateClientIdNumber(String clientIdNumber);

  Integer countCreditByClientIdNumber(String clientIdNumber);

}
