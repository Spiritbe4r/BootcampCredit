package com.bootcamp.bankCredit.beanCredit.credit;

import com.bootcamp.bankCredit.beanCredit.client.ClientCredit;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class TypeCredit extends ClientCredit {
private String id;
private String credittype;
}
