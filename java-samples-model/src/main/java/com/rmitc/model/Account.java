package com.rmitc.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Account {

    private String id;
    private String pan;
    private String pin;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

}
