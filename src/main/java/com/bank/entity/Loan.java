package com.bank.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String loanId;

    private double amount;
    private String status;

    @ManyToOne

    private Account account;
}
