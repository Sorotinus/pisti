import java.util.Random;
public class Deck {
    public Card[] cards;
    public int size;
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int symbol = 0; symbol < 4; symbol++) {
            for (int number = 1; number <= 13; number++) {
                this.cards[index++] = new Card(symbol, number);
            }
        }
        this.size = 52;
    }
    public void shuffle() {
        Random r = new Random(System.currentTimeMillis());
        for (int i = this.size - 1; i > 0; i--) {
            int a = r.nextInt(i + 1);
            Card example = this.cards[i];
            this.cards[i] = this.cards[a];
            this.cards[a] = example;
        }
    }
    public void cut(int numberofcut) {
        Card[] top = new Card[numberofcut];
        Card[] bottom = new Card[this.size - numberofcut];
        for (int i = 0; i < numberofcut; i++) {
            top[i] = this.cards[i];
        }
        for (int i = 0; i < this.size - numberofcut; i++) {
            bottom[i] = this.cards[numberofcut + i];
        }
        this.cards = new Card[this.size];
        for (int i = 0; i < this.size; i++) {
            if (i < this.size - numberofcut) {
                this.cards[i] = bottom[i];
            } else {
                this.cards[i] = top[i - (this.size - numberofcut)];
            }
        }
    }
}