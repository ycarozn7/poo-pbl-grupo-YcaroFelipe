package com.oficina.domain;
// telefone, nome.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ClienteTest {
   @Test
   void clienteValidoDeverSerCriado() {
    Telefone tel = new Telefone(11999999999);
    Cliente c1 = new Cliente("Giorgian Arrasca". tel);
    assertEquals("Giorgian Arrasca", c1.getNome());
   }
   @Test
   void ClienteSemNomeNumeroExcecao() {
    assertThrows(IllegalArgumentException.class, () -> {
        Telegone tel = new Telefone("11999999999");
        new Cliente(null, tel);
    });
   }
   @Test
   void clienteSemTelefoneException() {
    assertThrows(IllegalArgumentException.class, () -> {
        new Cliente("Giorgian Arrasca", null);
    });
   }
}
