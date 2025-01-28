public class Main{
    public static void main(String[] args){
        //CardGameGUI gui = new CardGameGUI(new ElevensBoard());
        //gui.displayGame();
        String[ ] ranks = {"K", "Q", "J", "A"};
        String[ ] suits = {"diamond", "heart", "club", "spade"};
        int[ ] pointValues = {1, 2, 3, 4};
        Deck d1 = new Deck(ranks, suits, pointValues);
        d1.deal();
        d1.deal();
        d1.deal();

        System.out.println(d1);
    }
}
