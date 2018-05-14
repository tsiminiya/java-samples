package com.rmitc.account;

import com.rmitc.dto.AccountDto;
import com.rmitc.model.Account;
import lombok.AllArgsConstructor;

import java.util.function.Function;

@AllArgsConstructor
public class AccountServiceNew {

    private static AccountDtoToAccountConverter accountDtoToAccountConverter = new AccountDtoToAccountConverter();
    private static Function<AccountDto, Account> converter = accountDto -> accountDtoToAccountConverter.convert(accountDto);

    private final AccountRepository accountRepository;

    public void save(AccountDto accountDto) {
        accountRepository.save(converter.apply(accountDto));
    }

}
