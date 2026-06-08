package com.oficina.application;

import com.oficina.domain.*;
import com.oficina.infrastructure.ImplementacaoOrdemDeServico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AbrirOrdemDeServicoTest {

    @Test
    void deveAbrirOrdemDeServico() {
        Placa placa = new Placa("ABC1D23");
        Veiculo veiculo = new Veiculo(placa, "Uno", 2020);
        Telefone tel = new Telefone("11999999999");
        Cliente cliente = new Cliente("Giorgian", tel);

        ImplementacaoOrdemDeServico repository = new ImplementacaoOrdemDeServico();
        AbrirOrdemDeServico useCase = new AbrirOrdemDeServico(repository);

        OrdemDeServico os = useCase.executar(veiculo, cliente);

        assertEquals(StatusOS.AGUARDANDO_DIAGNOSTICO, os.getStatus());
        assertEquals(1, repository.listarTodas().size());
    }
}