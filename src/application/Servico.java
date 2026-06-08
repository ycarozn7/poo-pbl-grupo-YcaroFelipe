package com.oficina.application;

import com.oficina.domain.OrdemDeServico;

public class Servico {

    public void executar(OrdemDeServico os) {
        os.iniciarExecucao();
        os.finalizar();
    }
}