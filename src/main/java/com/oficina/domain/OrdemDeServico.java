package com.oficina.domain;

public class OrdemDeServico {

    private final Veiculo veiculo;
    private final Cliente cliente;
    private StatusOS status;
    private final Orcamento orcamento;

    public OrdemDeServico(Veiculo veiculo, Cliente cliente) {
        if (veiculo == null) throw new IllegalArgumentException("Veiculo nao pode ser nulo");
        if (cliente == null) throw new IllegalArgumentException("Cliente nao pode ser nulo");
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.status = StatusOS.AGUARDANDO_DIAGNOSTICO;
        this.orcamento = new Orcamento();
    }

    public void enviarOrcamento() {
        if (status == StatusOS.CANCELADA) throw new IllegalStateException("OS cancelada nao pode ser reaberta");
        if (status != StatusOS.AGUARDANDO_DIAGNOSTICO) throw new IllegalStateException("Status invalido: " + status);
        orcamento.validarParaEnvio();
        this.status = StatusOS.ORCAMENTO_ENVIADO;
    }

    public void aprovarOrcamento() {
        if (status != StatusOS.ORCAMENTO_ENVIADO) throw new IllegalStateException("Status invalido: " + status);
        this.status = StatusOS.APROVADA;
    }

    public void iniciarExecucao() {
        if (status != StatusOS.APROVADA) throw new IllegalStateException("Status invalido: " + status);
        this.status = StatusOS.EM_EXECUCAO;
    }

    public void finalizar() {
        if (status != StatusOS.EM_EXECUCAO) throw new IllegalStateException("Status invalido: " + status);
        this.status = StatusOS.FINALIZADA;
    }

    public void cancelar() {
        if (status == StatusOS.FINALIZADA) throw new IllegalStateException("OS finalizada nao pode ser cancelada");
        this.status = StatusOS.CANCELADA;
    }

    public Veiculo getVeiculo() { return veiculo; }
    public Cliente getCliente() { return cliente; }
    public StatusOS getStatus() { return status; }
    public Orcamento getOrcamento() { return orcamento; }
}