package com.rmitc.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AccountDto {

    private String pan;
    private String pin;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

}
