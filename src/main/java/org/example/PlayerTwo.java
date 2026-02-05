package org.example;

import java.util.Scanner;

public class PlayerTwo {
    Playboard playboard;
    Scanner input;

    public PlayerTwo(Playboard playboard, Scanner input) {
        this.playboard = playboard;
        this.input = input;
    }

    public void setPlayerTwo() {
        System.out.println("Player Two, it's your turn");
        Scanner input = new Scanner(System.in);
        int wo = input.nextInt();

        switch (wo) {
            case 1:
                System.out.println(playboard.setStringBoard(1, "O"));
                break;
            case 2:
                System.out.println(playboard.setStringBoard(2, "O"));
                break;
            case 3:
                System.out.println(playboard.setStringBoard(3, "O"));
                break;
            case 4:
                System.out.println(playboard.setStringBoard(4, "O"));
                break;
            case 5:
                System.out.println(playboard.setStringBoard(5, "O"));
                break;
            case 6:
                System.out.println(playboard.setStringBoard(6, "O"));
                break;
            case 7:
                System.out.println(playboard.setStringBoard(7, "O"));
                break;
            case 8:
                System.out.println(playboard.setStringBoard(8, "O"));
                break;
            case 9:
                System.out.println(playboard.setStringBoard(9, "O"));
                break;
            case 10:
                System.out.println(playboard.setStringBoard(10, "O"));
                break;
            default:
                System.out.println("Ungültige Eingabe!");
                break;
        }

    }
}
