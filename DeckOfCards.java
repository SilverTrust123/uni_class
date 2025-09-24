import java.security.SecureRandom;
public class DeckOfCards{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARD = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards(){
        String[] face = {"Ace","Deuce","Thre","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Heart","Diamond","Clubs","Spades"};

        deck = new Card[NUMBER_OF_CARD];
        currentCard = 0;

        for(int count = 0; count < deck.length; count++ ){
            deck[count] = new Card(face[count % 13], suits[count / 13]);
        }
    }
    public int[] totalHand(Card[] hand) {
        int[] number = new int[14]; 

        for (int i = 0; i < number.length; i++) {
            number[i] = 0;
        }

        for (Card card : hand) {
            switch (card.getFace()) {
                case "Ace":
                    number[1]++;
                    break;
                case "Deuce":
                    number[2]++;
                    break;
                case "Three":
                    number[3]++;
                    break;
                case "Four":
                    number[4]++;
                    break;
                case "Five":
                    number[5]++;
                    break;
                case "Six":
                    number[6]++;
                    break;
                case "Seven":
                    number[7]++;
                    break;
                case "Eight":
                    number[8]++;
                    break;
                case "Nine":
                    number[9]++;
                    break;
                case "Ten":
                    number[10]++;
                    break;
                case "Jack":
                    number[11]++;
                    break;
                case "Queen":
                    number[12]++;
                    break;
                case "King":
                    number[13]++;
                    break;
                default:
                    break;
            }
        }

        return number;
    }


}