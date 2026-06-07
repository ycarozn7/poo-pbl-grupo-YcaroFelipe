package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

class DinheiroTest {

    @Test
    void dinheiroValidoDeveSerCriado() {
        Dinheiro d = new Dinheiro(new BigDecimal("100.00"));
        assertEquals(new BigDecimal("100.00"), d.getValor());
    }

    @Test
    void dinheiroNegativoDeveLancarExcecao() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Dinheiro(new BigDecimal("-1.00"));
        });
    }

    @Test
    void somarDoisDinheirosDeveRetornarSoma() {
        Dinheiro d1 = new Dinheiro(new BigDecimal("100.00"));
        Dinheiro d2 = new Dinheiro(new BigDecimal("50.00"));
        Dinheiro soma = d1.somar(d2);
        assertEquals(new BigDecimal("150.00"), soma.getValor());
    }
}