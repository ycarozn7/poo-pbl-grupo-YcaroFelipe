# poo-pbl-grupo-YcaroFelipe
UNIMA
Professor: Amaury
Aluno: Ycaro Felipe 

- Oficina Mecânica -

 Projeto de Programação Orientada a Objetos no qual usa o gerenciador de dependências Maven para auxílio rodando testes, compilando e oferencendo o JUnit que verifica se um bloco de código está certo. Outras ferramentas usadas foram DDD(Value object, entidades e aggregates), TDD(Usado para fazer os testes onde o teste tinha valor vermelho e o dominio valor verde, qualquer melhora era usado o Refactor) e git.

 Como o projeto é rodado:
   É uma oficina que tem um sistema com foco no atendimento por meio de Ordens de Serviços.
   Quando o cliente entrar em contato com o atendente: O mecânico examinará o veículo e diagnosticará os problemas.
   A partir disso o pessoal do financeiro fará o orçamento do serviço.
   Cliente irá aprovar se irá querer ou não o serviço. 
   Caso aprovado: pagamento será feito e o serviço executado.
   Caso recusado: será cancelado.
 O sistema é controlado por meio das ordens de serviço:
    AGUARDANDO_DIAGNOSTICO,
    ORCAMENTO_ENVIADO,
    APROVADA,
    EM_EXECUCAO,
    FINALIZADA,
    CANCELADA
