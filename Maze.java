package edu.wctc;

public class Maze {
    Room currentRoom;
    Player player;
    boolean isFinished =false;

    public Maze (){
         player = new Player();

         currentRoom = new Supply("supply");
       Room one = new Jungle ("jungle");
       Room two = new City ("san franciso");

       currentRoom.setNorth(one);
       one.setSouth(currentRoom);
       one.setEast(two);
       two.setWest(one);

    }
public String exitCurrentRoom(){
      if (currentRoom instanceof Exit){
          isFinished =true;
          return ((Exit) currentRoom).exit(player);
      }
      else
          return "You cannot exit this room";
}
public String interactWithCurrentRoom(){
        if(currentRoom instanceof Interact){
            return ((Interact)currentRoom).interact(player);
        }
        else
            return "Interacting in this room is not possible";
}
public String lootCurrentRoom(){
        if(currentRoom instanceof Lootable){
            return ((Lootable)currentRoom).Loot(player);
        }
else
    return "This room has no Loot";
}
public boolean move(char direction) {
    if (currentRoom.isValidDirection(direction)){
        currentRoom = currentRoom.getAdjoiningRoom(direction);
        return true;
    }
else
    return false;
}
    public int getPlayerScore() {
        return player.getscore();

    }
    public String getInventory(){
        return player.getInventory();
    }
    public String getCurrentRoomDescription (){
        return currentRoom.getDescription();
    }
    public String getCurrentRoomExits(){
        return currentRoom.getExits();
    }
    public boolean isFinished(){
        return isFinished;
    }
}
