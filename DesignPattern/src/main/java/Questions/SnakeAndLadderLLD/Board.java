package Questions.SnakeAndLadderLLD;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    private Cell[][] cells;
    Board(int size, int noOfSnakes, int noOfLadders) {
        initializeCells(size);
        initializeJumps(noOfSnakes, true);
        initializeJumps(noOfLadders, false);
    }
    public void initializeCells(int size) {
        cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }
    public void initializeJumps(int numOfJumps, boolean isSnake) {
        if (isSnake) {
            while (numOfJumps > 0) {
                int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
                int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
                if (start <= end) {
                    continue;
                }
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                cell.setJump(jump);
                numOfJumps --;
            }
        }else {
            while (numOfJumps > 0) {
                int start = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
                int end = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
                if (start >= end) {
                    continue;
                }
                Jump jump = new Jump(start, end);
                Cell cell = getCell(start);
                cell.setJump(jump);
                numOfJumps --;
            }
        }

    }
    public Cell getCell(int start) {
        int row = start / cells.length;
        int col = start % cells.length;
        return cells[row][col];
    }
    public int getBoardRow() {
        return cells.length;
    }
    public int getBoardCol() {
        return cells[0].length;
    }
}
