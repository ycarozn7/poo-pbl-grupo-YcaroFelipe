package com.oficina.domain;

public final class Telefone {

    private final String numero;

    public Telefone(String numero) {
        if (numero == null || !numero.matches("\\d{10,11}")) {
            throw new IllegalArgumentException("Telefone inválido: " + numero);
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;
        Telefone telefone = (Telefone) o;
        return numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        return numero.hashCode();
    }
}