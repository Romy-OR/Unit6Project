public class Deck{
    Card[] cards = new Card[52];
    int size;
    
    public Deck(String[] ranks, String[] suits, int[] points){
        Card[] deck = new Card[ranks.length * suits.length];
        int count = 0;
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < ranks.length; j++){
                Card ncard = new Card(ranks[j], suits[i], points[j]);
                deck[count] = ncard;
                count++;
            }
        }
        size = deck.length;
    }
}

