package edu.wctc;



public abstract class Room {
    String name;

    Room north, south, east, west, up, down;

    public Room(String room) {
        this.name = room;
    }

    public abstract String Loot(Player one);

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction) {
        if (direction == 'n' && north != null)
            return north;
        else if (direction == 's' && south != null)
            return south;
        else if (direction == 'e' && east != null)
            return east;
        else if (direction == 'w' && west != null)
            return west;
        else if (direction == 'u' && up != null)
            return up;
        else if (direction == 'd' && down != null)
            return down;
        else
    return null;
    }
 public String getExits (){
        String direction = "";
        if(north!=null)
            direction += "n";
        if(south != null)
             direction+= "s";
        if(east!= null)
            direction += "e";
        if (west != null)
            direction += "w";
        if(up != null)
            direction +="up";
        if (down !=null)
            direction+= "down";
        return direction;
 }
 public String getName (){
        return name;
 }
 public boolean isValidDirection(char direction){
     if (direction == 'n' && north != null)
         return true;
     else if (direction == 's' && south != null)
         return true;
     else if (direction == 'e' && east != null)
         return true;
     else if (direction == 'w' && west != null)
         return true;
     else if (direction == 'u' && up != null)
         return true;
     else if (direction == 'd' && down != null)
         return true;
     else
         return false;
 }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }
}
