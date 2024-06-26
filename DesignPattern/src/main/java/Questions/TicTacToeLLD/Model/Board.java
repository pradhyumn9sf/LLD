package Questions.TicTacToeLLD.Model;

public class Board {
    private int size;
    private PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (row >= size || col >= size || row < 0 || col < 0 || board[row][col] != null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public boolean isBoardEmpty() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType + " ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();
        }
    }

    public PlayingPiece getPlayingPiece(int row, int col) {
        return board[row][col];
    }
}
