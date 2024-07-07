package facade;

public class Order {
    public boolean confirmar() {
        return OrderFacade.verificarPendenciaConfirmacao(this);
    }

}