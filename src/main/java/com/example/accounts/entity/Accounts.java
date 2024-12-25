package com.example.accounts.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Accounts extends BaseEntity {
    @Id
    @Column(name = "account_number")
    private Long accountNumber;
    @Column(name = "customer_id")
    private Long customerId;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "branch_address")
    private String branchAddress;
}
