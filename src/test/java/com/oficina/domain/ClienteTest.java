package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void clienteValidoDeveSerCriado() {
        Telefone tel = new Telefone("11999999999");
        Cliente c = new Cliente("Giorgian Arrasca", tel);
        assertEquals("Giorgian Arrasca", c.getNome());
    }

    @Test
    void clienteSemNomeDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            Telefone tel = new Telefone("11999999999");
            new Cliente(null, tel);
        });
    }

    @Test
    void clienteSemTelefoneDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cliente("Giorgian Arrasca", null);
        });
    }
}