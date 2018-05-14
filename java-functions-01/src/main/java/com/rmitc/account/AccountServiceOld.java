package com.rmitc.account;

import com.rmitc.dto.AccountDto;
import com.rmitc.model.Account;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountServiceOld {

    private final AccountRepository accountRepository;
    private final AccountDtoToAccountConverter accountDtoToAccountConverter;

    public void save(AccountDto accountDto) {
        accountRepository.save(convertToModel(accountDto));
    }

    private Account convertToModel(AccountDto accountDto) {
        return accountDtoToAccountConverter.convert(accountDto);
    }

}
