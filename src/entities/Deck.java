package entities;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public ArrayList getDeck(){
        return this.deck;
    }

}
