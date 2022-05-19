package com.dio.sistemaBancariodio.domain;


import com.dio.sistemaBancariodio.exception.ExceptionInsufficientFunds;
import com.dio.sistemaBancariodio.gateway.GatewayOperacoes;
import lombok.Data;

@Data
public abstract class Account implements GatewayOperacoes {

    private User user;
    private String numberAccount;
    private double balance;

    @Override
    public boolean withdraw(double value) {
        if(this.balance == 0 && this.balance < value ) {
            throw new ExceptionInsufficientFunds("Saldo insuficiente.");
        }
        this.balance = this.balance - value;
        return true;
    }
}


