package org.example;

public class Playboard {

    String[] stringBoard;
    boolean fieldIsSet = true;
    boolean boardFull = false;

    public Playboard() {
        stringBoard = new String[10];
        createPlayboard(stringBoard);
    }

    public boolean isFieldIsSet() {
        return fieldIsSet;
    }

    public void setFieldIsSet(boolean fieldIsSet) {
        this.fieldIsSet = fieldIsSet;
    }

    public String[] getStringBoard() {

        return stringBoard;
    }

    public boolean isBoardFull() {
        return boardFull;
    }

    private void createPlayboard(String[] stringBoard) {
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
        if (checkIfBoardIsFull(stringBoard)) {
            System.out.println("Field is Full! Draw");
            boardFull = true;
            return "******\n" +
                    "*DRAW*\n" +
                    "******";
        }
        if (isFieldAlreadySet(stringBoard, index)) {
            System.out.println("Field " + index + " is already set");
            fieldIsSet = true;
        } else if (index >= 1 && index < stringBoard.length) {
            stringBoard[index] = value;
            fieldIsSet = false;
        }
        else {
            System.out.println("Ungültiger Index!");
            fieldIsSet = true;
        }

        if (checkIfBoardIsFull(stringBoard)) {
            System.out.println("Field is Full! Draw");
            boardFull = true;
            return "******\n" +
                    "*DRAW*\n" +
                    "******";
        }
        return  "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[1] + "  |  " + stringBoard[2] + "  |  " + stringBoard[3] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[4] + "  |  " + stringBoard[5] + "  |  " + stringBoard[6] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n"+
                "|  " + stringBoard[7] + "  |  " + stringBoard[8] + "  |  " + stringBoard[9] + "  |  \n"+
                "| --- |" + " --- |" + " --- |\n";
    }

    private boolean isFieldAlreadySet(String[] board, int fieldIndex) {
        return board[fieldIndex].equals("X") || board[fieldIndex].equals("O");
    }

    private boolean checkIfBoardIsFull(String[] board) {
        for (int i = 1; i < board.length; i++) {
            String field = board[i];
            if (field.matches("[1-9]+")) {
                return false;
            }
        }
        return true;
    }

}