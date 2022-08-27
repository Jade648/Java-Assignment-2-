package edu.wctc;

public class Jungle extends Room implements Interact, Lootable {

    public Jungle(String name) {
        super(name);
    }

    public String interact(Player one) {
       return  "You walk out into the Jungle"+"you use the Sword and Shield to defend yourself from a Black Knight.";
    }

    public String Loot(Player one) {
     one.addToInventory("Powerup");
     one.addToScore(5);
     return "You found a Powerup";
    }

    public String getDescription() {
        return "You walk out into the Jungle and stop to get out when you see a Powerup in the bushes." +
                "You are interrupted by a heard of elephants, but then the elephants are interrupted by a Black Panther." + "The Panther sees you, you have to get past the panther by trying to go East to the next room.";
    }
}
