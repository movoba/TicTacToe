package org.example;

import java.util.Scanner;

public class PlayerOne {
    Playboard playboard;
    Scanner input;


    public PlayerOne(Playboard playboard,  Scanner input) {
        this.playboard = playboard;
        this.input = input;
    }

    public void setPlayerOne() {
        System.out.println("Player One, it's your turn");

        int wo = input.nextInt();

        switch (wo) {
            case 1:
                System.out.println(playboard.setStringBoard(1, "X"));
                break;
            case 2:
                System.out.println(playboard.setStringBoard(2, "X"));
                break;
            case 3:
                System.out.println(playboard.setStringBoard(3, "X"));
                break;
            case 4:
                System.out.println(playboard.setStringBoard(4, "X"));
                break;
            case 5:
                System.out.println(playboard.setStringBoard(5, "X"));
                break;
            case 6:
                System.out.println(playboard.setStringBoard(6, "X"));
                break;
            case 7:
                System.out.println(playboard.setStringBoard(7, "X"));
                break;
            case 8:
                System.out.println(playboard.setStringBoard(8, "X"));
                break;
            case 9:
                System.out.println(playboard.setStringBoard(9, "X"));
                break;
            case 10:
                System.out.println(playboard.setStringBoard(10, "X"));
                break;
            default:
                System.out.println("Ungültige Eingabe!");
                break;
        }


    }
}
