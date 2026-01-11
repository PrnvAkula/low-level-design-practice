package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class Board {
    private int size;
    private PlayingPiece[][] board;
    
    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece [size][size];
    }

    public int getSize(){
        return size;
    }

    public PlayingPiece[][] getBoard(){
        return board;
    }
    
    public boolean placePiece(PlayingPiece piece, int x, int y){
        if(x < 0 || x >= size || y < 0 || y >= size){
            throw new IllegalArgumentException("Invalid board position");
        }
        if(board[x][y] != null){
            return false;
        }
        board[x][y] = piece;
        return true;
    }

    public List<SimpleEntry< Integer, Integer>> getAvailablePositions(){
        List<SimpleEntry<Integer, Integer>> availablePositions = new ArrayList<>();
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] == null){
                    availablePositions.add(new SimpleEntry<>(i,j));
                }
            }
        }
        return availablePositions;
    }

    public void printBoard(){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].pieceType.name() + "   ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
