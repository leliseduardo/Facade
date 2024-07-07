package facade;

public class Address extends OnlineStore {
    private static Address address = new Address();

    private Address() {};

    public static Address getInstancia() {
        return address;
    }
}