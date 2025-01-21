public class Card{
    String rank;
    String suit;
    int pointValue;

    public Card(String r, String s, int v){
        rank = r;
        suit = s;
        pointValue = v;
    }

    public void setRank(String nRank){
        rank = nRank;
    }

    public void setSuit(String nSuit){
        suit = nSuit;
    }

    public void setValue(int nValue){
        pointValue = nValue;
    }

    public boolean equals(Card c){
        boolean isEqual = false;
        if ((this.rank.equals(c.rank)) || (this.suit.equals(c.suit)) || (this.pointValue == c.pointValue)){
            isEqual = true;
        }
        return isEqual;
    }

    public String toString(){
        return (this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")");
    }

}
