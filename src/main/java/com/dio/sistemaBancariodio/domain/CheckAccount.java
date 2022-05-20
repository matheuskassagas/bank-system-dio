package com.dio.sistemaBancariodio.domain;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CheckAccount extends Account {

    public CheckAccount(User user) {
        super(user);
    }

    public void bankFee(){
        double tax = -49.9;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((new Date(System.currentTimeMillis())));
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        while (day == 19 ){
            super.setBalance(tax);
        }
    }

    @Override
    public void printExtract() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printExtract();
    }
}
