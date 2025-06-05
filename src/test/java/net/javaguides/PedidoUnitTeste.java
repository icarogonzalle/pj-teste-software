package net.javaguides;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoUnitTeste {

    private Pedido pedido;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Início das suítes de testes");
    }

    @BeforeEach
    void clienteTeste() {
        pedido = new Pedido(1, "Cliente teste.");
    }

    @AfterEach
    void finalizarTeste() {
        System.out.println("Teste finalizado");
    }

    @Test
    void deveAdicionarItemComSucesso() {
        pedido.adicionarItem("Item", 15.0, 2);
        assertEquals(1, pedido.getItens().size());
    }

    @Test
    void naoDeveAdicionarItemSePedidoFinalizado() {
        pedido.adicionarItem("Item", 20.0, 2);
        pedido.finalizarPedido();
        assertThrows(IllegalStateException.class, () -> pedido.adicionarItem("Item 2", 5.0, 1));
    }

    @Test
    void deveCalcularTotalCorretamente() {
        pedido.adicionarItem("Item 1", 30.0, 2);
        pedido.adicionarItem("Item 2", 5.0, 3);
        assertEquals(35.0, pedido.calcularTotal());
    }

    @Test
    void deveRetornarTotalDeItens() {
        pedido.adicionarItem("Item1 ", 45.0, 2);
        pedido.adicionarItem("Item 2", 10.0, 3);
        assertEquals(5, pedido.totalDeItens());
    }

    @Test
    void deveFinalizarPedidoComItens() {
        pedido.adicionarItem("Item", 50.0, 1);
        pedido.finalizarPedido();
        assertTrue(pedido.isFinalizado());
    }


    @Test
    public void testeGetCliente() {
        assertEquals("Cliente teste.", pedido.getCliente());
    }

}
