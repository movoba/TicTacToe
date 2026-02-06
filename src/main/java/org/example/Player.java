package org.example;

import java.util.Scanner;

public class Player {
    Playboard playboard;
    Scanner input;
    Boolean playerOneTurn = true;

    public Player(Playboard playboard, Scanner input) {
        this.playboard = playboard;
        this.input = input;
    }

    public void setPlayerOneTurn(Boolean playerOneTurn) {
        this.playerOneTurn = playerOneTurn;
    }

    public void setPlayerSymbol() {

        int field = input.nextInt();

        switch (field) {
            case 1:
                System.out.println(playboard.setStringBoard(1, playerOneTurn == false ? "O" : "X"));
                break;
            case 2:
                System.out.println(playboard.setStringBoard(2, playerOneTurn == false ? "O" : "X"));
                break;
            case 3:
                System.out.println(playboard.setStringBoard(3, playerOneTurn == false ? "O" : "X"));
                break;
            case 4:
                System.out.println(playboard.setStringBoard(4, playerOneTurn == false ? "O" : "X"));
                break;
            case 5:
                System.out.println(playboard.setStringBoard(5, playerOneTurn == false ? "O" : "X"));
                break;
            case 6:
                System.out.println(playboard.setStringBoard(6, playerOneTurn == false ? "O" : "X"));
                break;
            case 7:
                System.out.println(playboard.setStringBoard(7, playerOneTurn == false ? "O" : "X"));
                break;
            case 8:
                System.out.println(playboard.setStringBoard(8, playerOneTurn == false ? "O" : "X"));
                break;
            case 9:
                System.out.println(playboard.setStringBoard(9, playerOneTurn == false ? "O" : "X"));
                break;
            case 10:
                System.out.println(playboard.setStringBoard(10, playerOneTurn == false ? "O" : "X"));
                break;
            default:
                System.out.println("Ungültige Eingabe!");
                break;
        }
    }
}
