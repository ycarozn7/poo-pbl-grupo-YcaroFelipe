package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void veiculoValidoDeveSerCriado() {
        Placa placa = new Placa("ABC1D23");
        Veiculo v = new Veiculo(placa, "Uno", 2012);
        assertEquals("Uno", v.getModelo());
        assertEquals(2012, v.getAno());
    }

    @Test
    void veiculoSemPlacaDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Veiculo(null, "Uno", 2012);
        });
    }

    @Test
    void veiculoSemModeloDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            Placa placa = new Placa("ABC1D23");
            new Veiculo(placa, null, 2012);
        });
    }
}