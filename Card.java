
public  class Card{
    private  String face;
    private  String suit;

    public Card(String cardFace,String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    public String toString(){
        return face + "of" +suit;
    }
    public String getFace(){
        return face;
    }
    public void setFace(String cardFace){
        this.face = cardFace;
    }
    public String getSuit(){
        return suit;
    }
    public void setSuit(String cardString){
        this.suit = cardString;
    }

}