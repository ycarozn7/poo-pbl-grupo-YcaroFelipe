package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void telefoneValidoDeveSerCriado() {
        Telefone t = new Telefone("11999999999");
        assertEquals("11999999999", t.getNumero());
    }

    @Test
    void telefoneInvalidoDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("123");
        });
    }

    @Test
    void telefoneNuloDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(null);
        });
    }
}