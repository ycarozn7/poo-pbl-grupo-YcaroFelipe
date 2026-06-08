package com.oficina.application;

import com.oficina.domain.Cliente;
import com.oficina.domain.OrdemDeServico;
import com.oficina.domain.OrdemDeServicoRepository;
import com.oficina.domain.Veiculo;

public class AbrirOrdemDeServico {

    private final OrdemDeServicoRepository repository;

    public AbrirOrdemDeServico(OrdemDeServicoRepository repository) {
        this.repository = repository;
    }

    public OrdemDeServico executar(Veiculo veiculo, Cliente cliente) {
        OrdemDeServico os = new OrdemDeServico(veiculo, cliente);
        repository.salvar(os);
        return os;
    }
}