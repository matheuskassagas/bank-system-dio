package com.dio.sistemaBancariodio.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class State {

    private String nome;
    private List<City> cityList = new ArrayList<>();

}
