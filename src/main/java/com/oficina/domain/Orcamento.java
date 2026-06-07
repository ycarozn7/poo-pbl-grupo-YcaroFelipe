package com.oficina.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Orcamento {
   private final List<ItemOrcamento> itens = new ArrayList<>();
   public void adicionarItem(ItemOrcamento item) {
    if(item == null) throw new IllegalArgumentException("Item não pode ter valor nulo.");
    itens.add(item);
   }
   public Dinheiro getTotal() {
    Dinheiro total = new Dinheiro(new BigDecimal("0.00"));
    for(ItemOrcamento item : itens) {
        total = total.somar(item.getValor());
   }
    return total;
  }
   public void validarParaEnvio() {
    if (itens.isEmpty()) {
        throw new IllegalStateException("Orçamento não pode está sem itens.");

    }
   }
   public List<ItemOrcamento> getItens() {
    return Collections.unmodifiableList(itens);
   }
}
   

