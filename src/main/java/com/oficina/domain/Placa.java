package com.oficina.domain;

public final class Placa {

    private final String valor;

    public Placa(String valor) {
        if (valor == null || !valor.matches("[A-Z]{3}[0-9][A-Z0-9][0-9]{2}")) {
            throw new IllegalArgumentException("Placa invalida: " + valor);
        }
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Placa)) return false;
        Placa placa = (Placa) o;
        return valor.equals(placa.valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}