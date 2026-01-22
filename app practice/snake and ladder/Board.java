import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import enums.CellType;

public class Board {
    private Cell[] board;
    private int size;
    private List<Jump> jumps = new ArrayList<>();

    public Board(int size, int snakesCount, int ladderCount){
        this.size = size;
        board = new Cell[size];

        for(int i=0; i< size; i++){
            board[i] = new Cell(i+1);
        }

        addSnakesAndLadders(snakesCount, ladderCount);
    }

    public Cell getCell(int number){
        if(number < 1 || number > size){
            throw new IllegalArgumentException("Illegal cell number");
        }

        return board[number-1];
    }

    public int getSize(){
        return size; 
    }

    public int getNextPosition(int currentPosition, int diceRoll){
        int newPosition = currentPosition + diceRoll;
        if(newPosition > size) return currentPosition;

        Cell cell = getCell(newPosition);
        if(cell.getCellType() == CellType.JUMP){
            for(Jump jump : jumps){
                if(jump.getStart() == newPosition){
                    return jump.getEnd();
                }
            }
        }
        return newPosition;
    }

    private void addSnakesAndLadders(int snakeCount, int ladderCount){
        Random random = new Random();

        while(snakeCount > 0){
            int snakeHead = random.nextInt(size) + 1;
            int snakeTail = random.nextInt(size) + 1;

            for(Jump jump : jumps){
                if(jump.getStart() == snakeHead){
                    continue;
                }
            }
    
            if(snakeHead <= snakeTail) continue;

            Jump snake = new Jump(snakeHead, snakeTail);
            jumps.add(snake);
            getCell(snakeHead).setCellType(CellType.JUMP);
            snakeCount--;
        }

        while(ladderCount > 0){
            int ladderStart = random.nextInt() + 1;
            int ladderEnd = random.nextInt() + 1;

            for(Jump jump : jumps){
                if(jump.getStart() == ladderStart){
                    continue;
                }
            }

            if(ladderStart >= ladderEnd) continue;

            Jump ladder = new Jump(ladderStart, ladderEnd);
            getCell(ladderStart).setCellType(CellType.JUMP);
            jumps.add(ladder);
            ladderCount--;
        }
    }
}
