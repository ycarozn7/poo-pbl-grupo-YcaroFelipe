package com.oficina.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

class OrdemDeServicoTest {

    private OrdemDeServico criarOS() {
        Placa placa = new Placa("ABC1D23");
        Veiculo veiculo = new Veiculo(placa, "Uno", 2020);
        Telefone tel = new Telefone("11999999999");
        Cliente cliente = new Cliente("GiorgianArrasca", tel);
        return new OrdemDeServico(veiculo, cliente);
    }

    @Test
    void novaOSDeveEstarAguardandoDiagnostico() {
        OrdemDeServico os = criarOS();
        assertEquals(StatusOS.AGUARDANDO_DIAGNOSTICO, os.getStatus());
    }

    @Test
    void enviarOrcamentoDeveAlterarStatus() {
        OrdemDeServico os = criarOS();
        os.getOrcamento().adicionarItem(new ItemOrcamento("Troca de pneu", new Dinheiro(new BigDecimal("180.00"))));
        os.enviarOrcamento();
        assertEquals(StatusOS.ORCAMENTO_ENVIADO, os.getStatus());
    }

    @Test
    void aprovarOrcamentoDeveAlterarStatus() {
        OrdemDeServico os = criarOS();
        os.getOrcamento().adicionarItem(new ItemOrcamento("Troca de pneu", new Dinheiro(new BigDecimal("180.00"))));
        os.enviarOrcamento();
        os.aprovarOrcamento();
        assertEquals(StatusOS.APROVADA, os.getStatus());
    }

    @Test
    void finalizarDeveAlterarStatus() {
        OrdemDeServico os = criarOS();
        os.getOrcamento().adicionarItem(new ItemOrcamento("Troca de pneu", new Dinheiro(new BigDecimal("180.00"))));
        os.enviarOrcamento();
        os.aprovarOrcamento();
        os.iniciarExecucao();
        os.finalizar();
        assertEquals(StatusOS.FINALIZADA, os.getStatus());
    }

    @Test
    void transicaoInvalidaDeveLancarExcecao() {
        OrdemDeServico os = criarOS();
        assertThrows(IllegalStateException.class, () -> {
            os.aprovarOrcamento();
        });
    }

    @Test
    void cancelarDeveAlterarStatus() {
        OrdemDeServico os = criarOS();
        os.cancelar();
        assertEquals(StatusOS.CANCELADA, os.getStatus());
    }
}