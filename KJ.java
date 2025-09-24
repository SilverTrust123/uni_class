import javax.smartcardio.Card;
public class KJ {
    public static void main(String[] args) {
        Card card1 = new Card("Hearts", "Ace");
        Card card2 = new Card("Diamonds", "King");
        Card card3 = new Card("Diamonds", "ACE");
        card3 = card1;
        card1 = card2;
        card2 = card3;
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
    }
}
