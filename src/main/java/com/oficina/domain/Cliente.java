package com.oficina.domain;

public class Cliente {
    private final String nome;
    private final Telefone telefone;

    public Cliente(String nome, Telefone telefone) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome não pode ser vazio");
        if (telefone == null) throw new IllegalArgumentException("Telefone não pode ser nulo");
        this.nome = nome;
        this.telefone = telefone;
    }
    public String getNome() { return nome; }
    public Telefone getTelefone() { return telefone; }
}