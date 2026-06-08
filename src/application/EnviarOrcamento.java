package com.oficina.application;

import com.oficina.domain.OrdemDeServico;

public class EnviarOrcamento {

    public void executar(OrdemDeServico os) {
        os.enviarOrcamento();
    }
}