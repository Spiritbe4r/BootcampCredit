package com.bootcamp.bankCredit.config;

import com.bootcamp.bankCredit.handlers.CreditHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CreditRouter {

  /**
   * Routes router function.
   *
   * @param creditHandler the credit handler
   * @return the router function
   */
  @Bean
  public RouterFunction<ServerResponse> routes(final CreditHandler creditHandler) {
    return route(GET("/api/credit"), creditHandler::findAll)
          .andRoute(GET("/api/credit/client/{clientIdNumber}"),
                creditHandler::findAllByClientIdNumber)
          .andRoute(POST("/api/credit"), creditHandler::createCredit)
          .andRoute(GET("/api/credit/{contractNumber}"), creditHandler::findCredit)
          .andRoute(DELETE("/api/credit/{id}"), creditHandler::deleteCredit);
  }


}
