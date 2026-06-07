package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
public class OrcamentoTest {
    @Test
    void orcamentoVazio() {
    Orcamento o = new Orcamento();
    assertEquals(new BigDecimal("0.00"), o.getTotal().getValor());
    }
    @Test
    void adicionarItem() {
        Orcamento o = new Orcamento();
        o.adicionarItem(new ItemOrcamento("Troca de pneu", new Dinheiro(new BigDecimal("180")))); 
        assertEquals(new BigDecimal("180.00"), o.getTotal().getValor());
    }
    @Test
    void orcamentoSemItem() {
        Orcamento o = new Orcamento();
        assertThrows(IllegalStateException.class, () -> {
            o.validarParaEnvio();
        });
    }
}

