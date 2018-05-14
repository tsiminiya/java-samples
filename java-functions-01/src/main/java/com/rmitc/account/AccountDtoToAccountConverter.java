package com.rmitc.account;

import com.rmitc.dto.AccountDto;
import com.rmitc.model.Account;

public class AccountDtoToAccountConverter {

    Account convert(AccountDto accountDto) {
        return Account.builder()
                        .id("some-id")
                        .firstName(accountDto.getFirstName())
                        .middleName(accountDto.getMiddleName())
                        .lastName(accountDto.getLastName())
                        .build();
    }

}
