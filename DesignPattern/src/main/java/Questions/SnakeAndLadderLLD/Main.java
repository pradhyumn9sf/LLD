package Questions.SnakeAndLadderLLD;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = game.start();
        System.out.println("winner of game is : " + player.getId());
    }
}
