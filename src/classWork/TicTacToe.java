package classWork;

import java.util.Scanner;

public class TicTacToe {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char [][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
//        boolean isContinue = true;
        printBoard(board);
        while (true){
            firstPlayerTurn(board);
            if (isGameFinished(board)) break;
            printBoard(board);
            secondPlayerTurn(board);
            if (isGameFinished(board)) break;
            printBoard(board);
        }

    }
    private static void printBoard(char [][] board){
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]);
        System.out.println("---------");
        System.out.println(board[1][0]+" | "+board[1][1]+" | "+board[1][2]);
        System.out.println("---------");
        System.out.println(board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
    }

    private static boolean hasPlayerWon(char[][]board, char symbol){
        if ((board[0][0] == symbol && board[0][1] == symbol & board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol & board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol & board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][0] == symbol & board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol & board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol & board[2][2] == symbol) ||
                (board[0][0] == symbol && board[1][1] == symbol & board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol & board[2][0] == symbol)){
            return true;
        }
        return false;
    }

    private static boolean isGameFinished(char[][]board){
        if (hasPlayerWon(board, 'X')){
            printBoard(board);
            System.out.println("First player wins");
            return true;
        }
        if (hasPlayerWon(board, 'O')){
            printBoard(board);
            System.out.println("Second player wins");
            return true;
        }
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("It is a draw game");
        return true;
    }

    private static void placeMove(char[][] board, int position, char symbol){
        switch (position){
            case 1 -> board[0][0] = symbol;

            case 2 -> board[0][1] = symbol;
            case 3 -> board[0][2] = symbol;
            case 4 -> board[1][0] = symbol;
            case 5 -> board[1][1] = symbol;

            case 6 -> board[1][2] = symbol;

            case 7 -> board[2][0] = symbol;

            case 8 -> board[2][1] = symbol;

            case 9 -> board[2][2] = symbol;

            default -> System.out.println("Wrong input");
        }
    }

    private static void firstPlayerTurn(char[][] board){
        int userInput;
        while (true){
            System.out.println("First player's turn.Chose a number from 1-9 to enter your move: ");
            userInput = input.nextInt();
            if (isMoveValid(board, userInput)){
                break;
            }else System.out.println(userInput + " is not a valid move");
        }
        placeMove(board, userInput, 'X');

    }

    private static void secondPlayerTurn(char[][] board){
        int userInput;
        while (true){
            System.out.println("Second player's turn. Chose a number from 1-9 to enter your move: ");
            userInput = input.nextInt();
            if (isMoveValid(board, userInput)){
                break;
            }else System.out.println(userInput + " is not a valid move");
        }
        placeMove(board, userInput, '0');

    }
    private static boolean isMoveValid(char[][] board, int position){
        switch (position){
            case 1 -> {
                return (board[0][0] == ' ');
            }

            case 2 -> {
                return  (board[0][1] == ' ');
            }
            case 3 -> {
                return board[0][2] == ' ';
            }
            case 4 -> {
                return board[1][0] == ' ';
            }
            case 5 -> {
                return board[1][1] == ' ';
            }
            case 6 -> {
                return board[1][2] == ' ';
            }
            case 7 -> {
                return board[2][0] == ' ';
            }
            case 8 -> {
                return board[2][1] == ' ';
            }
            case 9 -> {
                return board[2][2] == ' ';
            }
            default -> {
                return false;
            }
        }

    }
}
