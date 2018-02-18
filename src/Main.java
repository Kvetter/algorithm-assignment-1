import entities.Card;
import entities.Color;
import entities.Deck;
import sort.ShellSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ShellSort sort = new ShellSort();
        Deck deck = new Deck();

        //Creating cards
        for (int i = 0; i < 4; i++) {
            for (int n = 1; n < 14; n++) {
                if (i == 0) {
                    deck.addCard(new Card(Color.SPADES, n));
                } else if (i == 1) {
                    deck.addCard(new Card(Color.HEARTS, n));
                } else if (i == 2) {
                    deck.addCard(new Card(Color.CLUBS, n));
                } else if (i == 3) {
                    deck.addCard(new Card(Color.DIAMONDS, n));
                }
            }
        }

        ArrayList<Card> list = deck.getDeck();

        // Java shuffle method
        Collections.shuffle(list);

        //Shuffle from lecture
        for (int i = 1; i < list.size() - 1; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, i);
            Card toChange = list.get(randomNum);
            list.set(randomNum, list.get(i));
            list.set(i, toChange);
        }

        // Cards after shuffle
        System.out.println("Shuffling");
        for (Card card : list) {
            System.out.println("Color: " + card.getColor() + ", Number: " + card.getNumber());
        }

        // Sorting
        sort.sort(list);

        System.out.println("----------------------------");

        //Cards after sorting
        System.out.println("Sorting");
        for (Card card : list) {
            System.out.println("Color: " + card.getColor() + ", Number: " + card.getNumber());
        }


    }
}
