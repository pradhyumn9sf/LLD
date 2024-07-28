package Questions.SnakeAndLadderLLD;

public class Dice {
    private  int minVal;
    private  int maxVal;
    private int diceCount;
    Dice(int diceCount, int minVal, int maxVal) {
        this.minVal = minVal;
        this.maxVal = maxVal;
        this.diceCount = diceCount;
    }
    Dice(int diceCount) {
        this.minVal = 1;
        this.maxVal = 6;
        this.diceCount = diceCount;
    }
    public int rollDice() {
        int sumOfDice = 0;
        for (int i = 0; i < diceCount; i ++) {
            sumOfDice += (minVal + Math.random() * (maxVal - minVal + 1));
        }
        return sumOfDice;
    }
}
