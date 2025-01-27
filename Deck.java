public class Deck{
    private Card[] cards;
    private size;
    
    public Deck(String[] ranks, String[] suits, int[] points){
        Card[] deck = new Card[ranks.length * suits.length];
        int count = 0;
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                deck[count] = new Card(ranks[j], suits[i], points[j]);
                count++;
            }
        }
        cards = deck;
        size = deck.length;
    }
    
    public boolean isEmpty(){
        return (this.size == 0);
    }
    
    public int size(){
        return this.size;
    }
    
    public Card deal(){
        if (this.size > 0){
            size--;
            return cards[size];
        }
        else{
            return null;
        }
    }
    public String toString(){
        String inDeck = "";
        String dealt = "";
        end = this.length;
        for (int i = 0; i < size; i++){
            inDeck+= cards[i] + "/n";
        }
        for (int j = size; j < length; j++){
            dealt+= cards[j] + "/n";
        }
        return ("size = " + size + "/nUndealt Cards:"
    }
}
