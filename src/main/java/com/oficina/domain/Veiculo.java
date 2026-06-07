package com.oficina.domain;
import java.util.UUID
public class Veiculo {
    private final Placa placa;
    private final String modelo;
    private final int ano;
    public Veiculo(Placa placa, String model, int ano) {
        if (placa == null) throw new IllegalArgumentException("A placa não pode está vazia.");
        if (modelo == null || modelo.isBlank()) throw new IllegalArgumentException("Modelo não pode ser vazio.");
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    } 
    public Placa getPlaca() {
        return placa;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
}
