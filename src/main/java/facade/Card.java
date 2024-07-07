package facade;

public class Card extends OnlineStore {
    private static Card card = new Card();

    private Card() {};

    public static Card getInstance() {
        return card;
    }
}