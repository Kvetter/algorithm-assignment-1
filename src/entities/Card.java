package entities;

public class Card implements Comparable<Card> {

    private Color color;
    private int number;

    public Card (Color color, int number){
        this.color = color;
        this.number = number;
    }

    public Color getColor() {
        return this.color;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public int compareTo(Card other) {
        if (this.color.getColor() < other.color.getColor()) {
            return -1;
        } else if (this.color.getColor() > other.color.getColor()) {
            return 1;
        } else {
            return Integer.compare(this.number, other.number);
        }
    }
}
