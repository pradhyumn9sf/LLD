package Questions.SnakeAndLadderLLD;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;
    Game() {
        initializeGame();
    }
    public void initializeGame() {
        board = new Board(10, 5, 5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }
    public void addPlayers() {
        players = new LinkedList<>();
        players.add(new Player("id1", 0));
        players.add(new Player("id2", 0));
    }
    public Player start() {
        while (winner == null) {
            Player currPlayer = getCurrentPlayer();
            int countDice = dice.rollDice();
            int newPosition = countDice + currPlayer.getCurrentPosition();
            System.out.println("Current Player : " + currPlayer.getId() + " and Position : " + currPlayer.getCurrentPosition());
            if (newPosition >= board.getBoardRow() * board.getBoardCol()) {
                System.out.println("Current Player : " + currPlayer.getId() + " and NewPosition : " + newPosition + " skipping turn due to out of bounds");
                continue;
            }
            newPosition = checkNewPosition(newPosition);
            currPlayer.setCurrentPosition(newPosition);
            System.out.println("Current Player : " + currPlayer.getId() +  " and NewPosition : " + newPosition );
            if (newPosition == board.getBoardCol() * board.getBoardRow() - 1) {
                winner = currPlayer;
            }
        }

        return winner;
    }
    public Player getCurrentPlayer() {
        Player currPlayer = players.getFirst();
        players.removeFirst();
        players.addLast(currPlayer);
        return currPlayer;
    }
    public int checkNewPosition(int position) {
        Cell cell = board.getCell(position);
        Jump jump = cell.getJump();
        if (jump != null && jump.getStart() == position) {
            if (jump.getStart() < jump.getEnd()) {
                System.out.println("ladder taking from " + jump.getStart() + " to " + jump.getEnd());
            } else {
                System.out.println("Snake taking from " + jump.getStart() + " to " + jump.getEnd());
            }
            return jump.getEnd();
        }
        return position;
    }
}
