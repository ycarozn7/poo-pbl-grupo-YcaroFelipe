package com.oficina.domain;

import java.math.BigDecimal;

public final class Dinheiro {

    private final BigDecimal valor;

    public Dinheiro(BigDecimal valor) {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor inválido: " + valor);
        }
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Dinheiro somar(Dinheiro outro) {
        return new Dinheiro(this.valor.add(outro.valor));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinheiro)) return false;
        Dinheiro dinheiro = (Dinheiro) o;
        return valor.compareTo(dinheiro.valor) == 0;
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}