public class Card {
    private int symbol;
    private int number;
    public Card(int symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public void setSymbol(int symbol) {this.symbol = symbol;}
    public void setNumber(int number) {this.number = number;}
    public String getSymbol() {
        if(symbol == 0) {return "♥";}
        else if(symbol == 1) {return "♦";}
        else if(symbol == 2) {return "♣";}
        else if(symbol == 3) {return "♠";}
        else if(symbol == 5) {return "You played card ";}
        else {return "Unable";}
    }
    public int getNumber() {
        if (symbol == 5) {return 0;}
        else {return this.number;}
    }
}