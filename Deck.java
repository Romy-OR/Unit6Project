public class Deck{
    private Card[] cards;
    private int size;
    
    public Deck(String[] ranks, String[] suits, int[] points){
        Card[] deck = new Card[ranks.length * suits.length];
        int count = 0;
        for (int i = 0; i < ranks.length; i++){
            for (int j = 0; j < suits.length; j++){
                deck[count] = new Card(ranks[i], suits[j], points[i]);
                count++;
            }
        }
        cards = deck;
        size = deck.length;
        shuffle();
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public int size(){
        return size;
    }
    
    public Card deal(){
        if (size > 0){
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
        int end = cards.length;
        for (int i = 0; i < size; i++){
            inDeck+= cards[i] + "\n";
        }
        for (int j = size; j < end; j++){
            dealt+= cards[j] + "\n";
        }
        //return ("size = " + size + "/nUndealt Cards:/n" + inDeck + "/n/nDealt Cards:/n" + dealt); 
        return ("\nUndealt Cards:\n" + inDeck + "\n\nDealt Cards:\n" + dealt);
    }
    public void shuffle(){
        size = cards.length;
        for (int k = size - 1; k >= 1; k--){
            int r = (int)(Math.random() * (k + 1));
            Card temp = cards[k];
            cards[k] = cards[r];
            cards[r] = temp;
        }
    }
}
