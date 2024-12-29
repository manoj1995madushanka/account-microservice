package com.example.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {
    @NotEmpty(message = "Account number should not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digit")
    private Long accountNumber;
    @NotEmpty(message = "Account type can not be null or empty")
    private String accountType;
    @NotEmpty(message = "Branch address can not be null or empty")
    private String branchAddress;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
