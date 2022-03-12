package com.bootcamp.bankCredit.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientCreditDto {
    private String id;
    private String name;
    private String lastName;
    private String dni;
    private String account;
}
