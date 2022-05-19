package com.dio.sistemaBancariodio.domain;

import com.dio.sistemaBancariodio.gateway.GatewayOperacoes;
import lombok.Data;

@Data
public class CheckAccount extends Account {

    @Override
    public boolean withdraw(double valor) {
        double withdraw = valor + (valor * 0.02);
        return super.withdraw(withdraw);
    }

    @Override
    public void deposit(double value) {
        
    }

    @Override
    public void transfer(double value, GatewayOperacoes contaDestiny) {

    }

    @Override
    public void printExtract() {

    }
}
