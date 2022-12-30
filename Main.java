import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Card[] Player = new Card[4];
        Card[] AI = new Card[4];
        Card[] Board = new Card[4];
        Deck myDeck = new Deck();
        System.out.println("We created the deck.");
        System.out.println("Now, we are shuffling the deck.");
        myDeck.shuffle();
        System.arraycopy(myDeck.cards, 0, Player, 0, 4);
        System.arraycopy(myDeck.cards, 4, AI, 0, 4);
        System.arraycopy(myDeck.cards, 8, Board, 0, 4);
        System.out.println("We shuffled the deck. Now, which number of card you want to cut?");
        int noc = sc.nextInt();
        myDeck.cut(noc);
        System.out.println("Deck has been cut.");
        boolean gameNotFinishedYet = true;
        while (gameNotFinishedYet) {
            System.out.println("Board Cards: ");
            for (Card e : Board) {
                System.out.print("  " + e.getSymbol() + e.getNumber());
            }
            System.out.println();
            System.out.println("Your Cards: ");
            for (Card e : Player) {
                System.out.print("  " + e.getSymbol() + e.getNumber());
            }
            System.out.println();
            System.out.println("Write the number of the card you will play (Press 1-4): ");
            int playersMove = sc.nextInt() - 1;
            cardPlayed(Player[playersMove]);
            System.out.println();
            System.out.println("Opponents move...");
            }
        }
    public static void cardPlayed(Card played) {
        played.setSymbol(5);
        played.setNumber(5);
    }
}