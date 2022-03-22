package com.bootcamp.bankCredit.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ClientDTO {
  private String name;
  private String code;
  private String clientIdNumber;
}