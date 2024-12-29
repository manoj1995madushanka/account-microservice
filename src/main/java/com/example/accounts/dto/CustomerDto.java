package com.example.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "name length should between 5 and 30")
    private String name;
    @NotEmpty(message = "Email address can not be null or empty")
    @Email(message = "Email address is not valid")
    private String email;
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digit")
    private String mobileNumber;
    private AccountsDto accountsDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }
}
