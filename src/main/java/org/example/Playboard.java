package org.example;

public class Playboard {

    String[] stringBoard;

    public Playboard() {
        stringBoard = new String[10];
        createPlayboard(stringBoard);
    }

    public String[] getStringBoard() {
        return stringBoard;
    }

    public void createPlayboard(String[] stringBoard) {
        for (int i = 1; i < 10; i++) {
           stringBoard[i] = String.valueOf(i);
        }
        System.out.println("| --- |" + " --- |" + " --- |");
        System.out.println("|  " + stringBoard[1] + "  |  " + stringBoard[2] + "  |  " + stringBoard[3] + "  |  ");
        System.out.println("| --- |" + " --- |" + " --- |");
        System.out.println("|  " + stringBoard[4] + "  |  " + stringBoard[5] + "  |  " + stringBoard[6] + "  |  ");
        System.out.println("| --- |" + " --- |" + " --- |");
        System.out.println("|  " + stringBoard[7] + "  |  " + stringBoard[8] + "  |  " + stringBoard[9] + "  |  ");
        System.out.println("| --- |" + " --- |" + " --- |");
    }


    public String setStringBoard(int index, String value) {
        if (index >= 1 && index < stringBoard.length) {
            stringBoard[index] = value;
        } else {
            System.out.println("Ungültiger Index!");
        }
        return  "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[1] + "  |  " + stringBoard[2] + "  |  " + stringBoard[3] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[4] + "  |  " + stringBoard[5] + "  |  " + stringBoard[6] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[7] + "  |  " + stringBoard[8] + "  |  " + stringBoard[9] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n";
    }

}