package com.avwaveaf.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CustomerDTO {
    private String name;

    @NotEmpty(message = "Customer Name Cannot be empty")
    @Size(min = 3, max = 50, message = "Customer Email must be between 3 and 25 characters")
    @Email(message = "Invalid Email Address")
    private String email;

    @NotEmpty(message = "Phone Number Cannot be empty")
    @Digits(fraction = 0, integer = 12, message = "Invalid Phone Number")
    private String mobileNumber;

    private AccountsDTO accounts;
}

