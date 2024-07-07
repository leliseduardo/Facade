package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void deveRetornarPendenciaClienteOrder() {
        Order order = new Order();
        Client.getInstancia().addOrderPendente(order);

        assertEquals(false, order.confirmar());
    }

    @Test
    void deveRetornarPendenciaEnderecoOrder() {
        Order order = new Order();
        Address.getInstancia().addOrderPendente(order);

        assertEquals(false, order.confirmar());
    }

    @Test
    void deveRetornarPendenciaCartaoOrder() {
        Order order = new Order();
        Card.getInstance().addOrderPendente(order);

        assertEquals(false, order.confirmar());
    }

    @Test
    void deveRetornarorderSemPendenciaOrder() {
        Order order = new Order();

        assertEquals(true, order.confirmar());
    }

}