package Questions.TicTacToeLLD;

import Questions.TicTacToeLLD.Model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;
    TicTacToeGame() {
        initializeGame();
    }
    public void initializeGame() {
        players = new LinkedList<>();
        PlayingPieceX pieceX = new PlayingPieceX();
        Player player1 = new Player("player1", pieceX);
        PlayingPieceO pieceO = new PlayingPieceO();
        Player player2 = new Player("player2", pieceO);
        players.add(player1);
        players.add(player2);
        gameBoard = new Board(3);
    }
    public String startGame() {
        boolean isWinner = true;
        while (isWinner) {
            gameBoard.printBoard();
            Player player = players.removeFirst();
            PlayingPiece playingPiece = player.getPlayingPiece();
            System.out.println("Player name is : " + player.getName() + " Enter row,column : ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean pieceAdd = gameBoard.addPiece(inputRow, inputCol, playingPiece);
            if (!pieceAdd ) {
                System.out.println("Incorrect position , check the board");
                players.addFirst(player);
                continue;
            }
            players.addLast(player);
            boolean winner = isThereWinner(inputRow, inputCol, playingPiece);
            if (winner) {
                gameBoard.printBoard();
                return player.getName();
            }
            if(!gameBoard.isBoardEmpty()) {
                isWinner = false;
            }
        }
        gameBoard.printBoard();
        return "no one , it is a tie";
    }
    public boolean isThereWinner(int row, int col, PlayingPiece playingPiece) {
        boolean winner = false;
//        check row
        if(gameBoard.getPlayingPiece(row, 0) == playingPiece && gameBoard.getPlayingPiece(row, 1) == playingPiece && gameBoard.getPlayingPiece(row, 2) == playingPiece) {
            return  true;
        }
        if(gameBoard.getPlayingPiece(0, col) == playingPiece && gameBoard.getPlayingPiece(1, col) == playingPiece && gameBoard.getPlayingPiece(2, col) == playingPiece) {
            return  true;
        }
        if(gameBoard.getPlayingPiece(0, 0) == playingPiece && gameBoard.getPlayingPiece(1, 1) == playingPiece && gameBoard.getPlayingPiece(2, 2) == playingPiece) {
            return  true;
        }
        if(gameBoard.getPlayingPiece(2, 0) == playingPiece && gameBoard.getPlayingPiece(1, 1) == playingPiece && gameBoard.getPlayingPiece(0, 2) == playingPiece) {
            return  true;
        }
        return winner;
    }

}
