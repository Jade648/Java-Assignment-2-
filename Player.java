package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {

    int score = 0;
    List<String> inventory = new ArrayList<>();

    public void addToInventory(String a) {
        inventory.add(a);

    }

    public void addToScore(int score) {
        this.score += score;
    }
     public String getInventory(){
        if(inventory.isEmpty())
           return ("Inventory is empty");
        else
            return String.join("-",inventory);
    }
     public int getscore (){
        return score;
     }

}

