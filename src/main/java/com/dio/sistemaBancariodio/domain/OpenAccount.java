package com.dio.sistemaBancariodio.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OpenAccount {

    private Bank bank;
    private User user;
    private Date instante;
}
