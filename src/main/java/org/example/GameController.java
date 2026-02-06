package org.example;

import java.util.Scanner;

public class GameController {
    Playboard playboard;
    Player player;
    Scanner input = new Scanner(System.in);

    public GameController() {
        this.playboard = new Playboard();
        this.player = new Player(playboard, input);
    }

    public void startGame() {
        while (true) {
            if (playboard.isBoardFull()) {
                input.close();
                return;
            }
            playboard.setFieldIsSet(true);
            while (playboard.isFieldIsSet()) {
                player.setPlayerOneTurn(true);
                System.out.println("Player One, it's your turn");
                player.setPlayerSymbol();
                if (winCheck(playboard.getStringBoard()) || playboard.isBoardFull()) {
                    input.close();
                    return;
                }
            }
            if (playboard.isBoardFull()) {
                input.close();
                return;
            }
            playboard.setFieldIsSet(true);
            while (playboard.isFieldIsSet()) {
                player.setPlayerOneTurn(false);
                System.out.println("Player Two, it's your turn");
                player.setPlayerSymbol();
                if (winCheck(playboard.getStringBoard()) || playboard.isBoardFull()) {
                    input.close();
                    return;
                }
            }
            if (playboard.isBoardFull()) {
                input.close();
                return;
            }
        }
    }


    private boolean winCheck(String[] board) {
        int[][] winCombination =
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};
        for (int[] combination : winCombination) {
            int firstCombination = combination[0];
            int secondCombination = combination[1];
            int thirdCombination = combination[2];
            if (board[firstCombination] != null && board[firstCombination].equals(board[thirdCombination]) && board[firstCombination].equals(board[secondCombination])) {
                System.out.println("Congratulations \n" + (board[1].equals("X") ? """
                        *************
                        *Player One!*\s
                        *************
                        You win!""" : """
                        *************
                        Player Two!\s
                        *************
                        You win!"""));
                return true;
            }
        }
        return false;
    }
}