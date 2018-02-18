package entities;

import java.util.Comparator;

public enum Color {

    SPADES(1),
    HEARTS(2),
    CLUBS(3),
    DIAMONDS(4);

    private final int color;

    Color(int color) {
        this.color = color;
    }

    int getColor(){
        return color;
    }

}
