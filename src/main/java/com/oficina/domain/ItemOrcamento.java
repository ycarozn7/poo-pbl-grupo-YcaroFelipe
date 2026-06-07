package com.oficina.domain;

public class ItemOrcamento {
    private final String descricao;
    private final Dinheiro valor;
    public ItemOrcamento(String descricao, Dinheiro valor) {
        if(descricao == null || descricao.isBlank()) throw new IllegalArgumentException("A descrição não pode está vazia.");
        if(valor == null) throw new IllegalArgumentException("O valor não pode ser vazio");
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public Dinheiro getValor() {
        return valor;
    }
}
