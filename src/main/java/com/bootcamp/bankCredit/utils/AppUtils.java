package com.bootcamp.bankCredit.utils;

import com.bootcamp.bankCredit.model.client.ClientCredit;
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
