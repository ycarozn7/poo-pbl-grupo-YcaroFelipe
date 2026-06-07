package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.oficina.domain.Placa; 

public class PlacaTest { 
    
    @Test
    void placaValidaDeveSerCriada() {
        Placa p = new Placa("ABC1D23");
        assertEquals("ABC1D23", p.getValor());
    }

    @Test
    void placaInvalidaDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Placa("invalida");
        });
    }

    @Test
    void placaNulaDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Placa(null);
        });
    }
}