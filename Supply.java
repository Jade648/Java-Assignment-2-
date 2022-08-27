package edu.wctc;

public class Supply extends Room implements Lootable{
public Supply (String name){
    super(name);
}

    public String Loot(Player one) {
    one.addToInventory("Sword and Shield");
    one.addToScore(3);
        return "You found a Sword and Shield ";

    }

    @Override
    public String getDescription() {
        return "You enter a Supply room to get gear for your labyrinth journey and find a Sword and a Shield.";
    }
}
