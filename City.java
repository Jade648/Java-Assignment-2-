package edu.wctc;

public class City extends Room implements Interact, Exit,Lootable{

    public City(String name) {
        super(name);
    }

    @Override
    public String Loot(Player one) {
        one.addToInventory("Jeep");
        one.addToScore(3);
        return "You found another Jeep";

    }

    public String interact(Player one) {
        return "you drive the Jeep down an unfamiliar pathway coming from the East and suddenly find your self in the city";
    }

    public String exit(Player one) {
        return "You exited the maze";
    }

    {

    }
    public String getDescription() {
        return "You leave the Jungle behind you and enter the City you leave the game.";
    }
    }



