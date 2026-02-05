package org.example;

import java.util.Scanner;

public class GameController {
    Playboard playboard;
    PlayerOne playerOne;
    PlayerTwo playerTwo;
    Scanner input = new Scanner(System.in);

    public GameController() {
        this.playboard = new Playboard();
        this.playerOne = new PlayerOne(playboard, input);
        this.playerTwo = new PlayerTwo(playboard, input);

    }

    public void startGame() {
        while (true) {
            playerOne.setPlayerOne();
            if (winCheck()) {
                break;
            }
            playerTwo.setPlayerTwo();
            if (winCheck()) {
                break;
            }
        }
        input.close();
    }

    public boolean winCheck() {
         if (playboard.stringBoard[1].equals("X") && playboard.stringBoard[2].equals("X")
                && playboard.stringBoard[3].equals("X")) {
            System.out.println("Player One wins");
            return true;
        }
        if (playboard.stringBoard[1].equals("O") && playboard.stringBoard[2].equals("O")
        && playboard.stringBoard[3].equals("O")) {
            System.out.println("Player Two wins");
            return true;
        }

        return false;
    }
}
