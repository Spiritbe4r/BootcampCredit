package com.bootcamp.bankCredit.model.entities;


import com.bootcamp.bankCredit.model.dto.ClientDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "credit")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credit {

  @Id
  private String id;
  private double capital;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime dateOperation = LocalDateTime.now();

  @Indexed(unique = true)
  private String contractNumber;

  @NotNull
  private String clientIdNumber;

  private double amountInitial;

  private double amount;

  private String chargeDay;

  private double commission;

  private double interestRate;

  private boolean debitor;

  @NotNull
  private ClientDTO client;
}
