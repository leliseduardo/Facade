package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class OnlineStore {
    private List<Order> orderComPendencia = new ArrayList<Order>();

    public void addOrderPendente(Order order) {
        this.orderComPendencia.add(order);
    }

    public boolean verificarOrderComPendencia(Order order) {
        return this.orderComPendencia.contains(order);
    }
}