package com.oficina.domain;

import java.util.UUID;

public class Veiculo {

    private final Placa placa;
    private final String modelo;
    private final int ano;

    public Veiculo(Placa placa, String modelo, int ano) {
        if (placa == null) throw new IllegalArgumentException("Placa não pode ser nula");
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo não pode ser vazio");
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Placa getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
}