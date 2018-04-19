package models;

import java.util.ArrayList;

public class Player {
    private String name;
    private Colour colour;
    private ArrayList<Piece> armies;
    private ArrayList<Territory> territories;

    public Player(String name, Colour colour) {
        this.name = name;
        this.colour = colour;
        this.armies = new ArrayList<>();
        this.territories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }
}
