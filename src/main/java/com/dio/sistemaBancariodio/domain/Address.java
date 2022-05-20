package com.dio.sistemaBancariodio.domain;

import lombok.Data;

@Data
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private User user;
    private City city;
}
