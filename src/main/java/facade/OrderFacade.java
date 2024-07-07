package facade;

public class OrderFacade {
    public static boolean verificarPendenciaConfirmacao(Order pedido) {
        if (Address.getInstancia().verificarOrderComPendencia(pedido)) {
            return false;
        }
        if (Card.getInstance().verificarOrderComPendencia(pedido)) {
            return false;
        }
        if (Client.getInstancia().verificarOrderComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}