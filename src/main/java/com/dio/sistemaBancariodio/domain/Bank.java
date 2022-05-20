package com.dio.sistemaBancariodio.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bank {

    private String bankName;
    private List<Account> accounts = new ArrayList<>();

    public void printConta() {
/*      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(String.format("Titular: %s", this.user.getName()));
        System.out.println(String.format("Agencia: %d", this.getAgencia()));
        System.out.println(String.format("Conta: %d", this.getNumberAccount()));
        System.out.println(String.format("Saldo: %.2f", this.getBalance()));
        System.out.println(String.format(sdf.format(new Date(System.currentTimeMillis()))));*/
    }
}
