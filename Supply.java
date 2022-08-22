package edu.wctc;

public class Supply extends Room implements Lootable{
public Supply (String name){
    super(name);
}

    public String Loot(Player one) {
    one.addToInventory("Jeep");
    one.addToScore(3);
        return "You found a Jeep";

    }

    @Override
    public String getDescription() {
        return "You enter a Supply room to get gear for your safari and find a Jeep.";
    }
}
