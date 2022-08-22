package edu.wctc;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Maze safari = new Maze();
    Scanner keyboard = new Scanner(System.in);
    while(!safari.isFinished){
        System.out.println(safari.getCurrentRoomDescription());
        System.out.println(safari.getCurrentRoomExits());
        System.out.println("please put in a command");
        char command = keyboard.nextLine().charAt(0);
        if(command == 'n'||command == 's' || command == 'e'||command == 'w'|| command == 'u' ||command == 'd'){
            if(!safari.move(command))
                System.out.println("Movement is not in a valid direction");
        }
        if(command == 'i'){
            System.out.println(safari.interactWithCurrentRoom());
        }
         if (command == 'l'){
             System.out.println(safari.lootCurrentRoom());
         }
        if (command == 'x') {
            System.out.println(safari.exitCurrentRoom());
        }
        if (command == 'v'){
            System.out.println(safari.getInventory());
        }
        }
        System.out.println(safari.getPlayerScore());
    }
    }
