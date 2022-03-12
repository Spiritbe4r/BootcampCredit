package com.bootcamp.bankCredit.utils;

import com.bootcamp.bankCredit.beanCredit.client.ClientCredit;
import com.bootcamp.bankCredit.dto.ClientCreditDto;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ClientCreditDto entityToDto(ClientCredit clientCredit){
        ClientCreditDto clientDto= new ClientCreditDto();
        BeanUtils.copyProperties(clientCredit,clientDto);
        return clientDto;
    }
    public static ClientCredit DtoToEntity(ClientCreditDto clientDto){
        ClientCredit clientCredit = new ClientCredit();
        BeanUtils.copyProperties(clientDto, clientCredit);
        return clientCredit;
    }
}
