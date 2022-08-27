package edu.wctc;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Maze labyrinth = new Maze();
    Scanner keyboard = new Scanner(System.in);
    while(!labyrinth.isFinished){
        System.out.println(labyrinth.getCurrentRoomDescription());
        System.out.println(labyrinth.getCurrentRoomExits());
        System.out.println("please put in a command");
        char command = keyboard.nextLine().charAt(0);
        if(command == 'n'||command == 's' || command == 'e'||command == 'w'|| command == 'u' ||command == 'd'){
            if(!labyrinth.move(command))
                System.out.println("Movement is not in a valid direction");
        }
        if(command == 'i'){
            System.out.println(labyrinth.interactWithCurrentRoom());
        }
         if (command == 'l'){
             System.out.println(labyrinth.lootCurrentRoom());
         }
        if (command == 'x') {
            System.out.println(labyrinth.exitCurrentRoom());
        }
        if (command == 'v'){
            System.out.println(labyrinth.getInventory());
        }
        }
        System.out.println(labyrinth.getPlayerScore());
    }
    }
