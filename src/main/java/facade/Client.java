package facade;

public class Client extends OnlineStore {
    private static Client client = new Client();

    private Client() {};

    public static Client getInstancia() {
        return client;
    }
}