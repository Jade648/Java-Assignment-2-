package edu.wctc;

public class Jungle extends Room implements Interact, Lootable {

    public Jungle(String name) {
        super(name);
    }

    public String interact(Player one) {
       return  "You drive the Jeep into the Jungle"+"you use the Camera to take a picture of the elephants.";
    }

    public String Loot(Player one) {
     one.addToInventory("Camera");
     one.addToScore(5);
     return "You found a Camera";
    }

    public String getDescription() {
        return "You drive the Jeep out into the Jungle and stop to get out when you see a camera in the bushes." +
                "You are interrupted by a heard of elephants, but then the elephants are interrupted by a Black Panther." + "The Panther sees you, you have to get past the panther by trying to go East to the next room.";
    }
}
