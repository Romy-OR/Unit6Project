public class Main{
    public static void main(String[] args){
        //CardGameGUI gui = new CardGameGUI(new ElevensBoard());
        //gui.displayGame();
        String[] ranks1 = {"A", "B", "C"};
        String[] suits1 = {"Giraffes", "Lions"};
        int[] points1 = {2, 1, 6};
        Deck d1 = new Deck(ranks1, suits1, points1);
        for (Card c1 : d1){
            System.out.println(c1);
        }
    }
}
