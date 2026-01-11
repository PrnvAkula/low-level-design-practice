import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;
import java.util.Scanner;

import classes.Board;
import classes.Player;
import classes.PlayingPieceX;
import classes.PlayingPieceO;
import enums.GameStatus;
import enums.PieceType;

public class TicTacToeGame {
    private Deque<Player> players;
    private Player winner;
    private Board gameBoard;

    public Player getWinner(){
        return winner;
    }

    public void initializeGame(){
        PlayingPieceX pieceX = new PlayingPieceX();
        PlayingPieceO pieceO = new PlayingPieceO();

        Player player1 = new Player("player 1", pieceX);
        Player player2 = new Player("player 2", pieceO);

        players = new LinkedList<>();
        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public GameStatus startGame(){
        boolean noWinner = true;

        while(noWinner){
            gameBoard.printBoard();

            Player currentPlayer = players.removeFirst();

            List<SimpleEntry< Integer, Integer>> freeCells = gameBoard.getAvailablePositions();
            if(freeCells.isEmpty()){
                noWinner = false;
                continue;
            }

            System.out.println(currentPlayer.getName() + ", please enter your next move in [row,column] :");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            boolean validMove = gameBoard.placePiece(currentPlayer.getPlayingPiece(), inputRow, inputCol);
            if(!validMove){
                System.out.println("given coordinates are illegal, please try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            
            boolean isWinner = checkForWinner(inputRow, inputCol, currentPlayer.getPlayingPiece().getPieceType());
            if(isWinner){
                gameBoard.printBoard();
                winner = currentPlayer;
                inputScanner.close();
                return GameStatus.WIN;
            }
        }
        return GameStatus.DRAW;
    }

    public boolean checkForWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for(int i=0; i< gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[i][col] == null || gameBoard.getBoard()[i][col].getPieceType() != pieceType){
                rowMatch = false;
            }
        }

        for(int i=0; i<gameBoard.getSize(); i++){
            if(gameBoard.getBoard()[row][i] == null || gameBoard.getBoard()[row][i].getPieceType() != pieceType){
                colMatch = false;
            }
        }

        for(int i=0, j=0; i<gameBoard.getSize(); i++, j++){
            if(gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType){
                diagMatch = false;
            }
        }

        for(int i=0, j=gameBoard.getSize()-1; i<gameBoard.getSize(); i++, j--){
            if(gameBoard.getBoard()[i][j] == null || gameBoard.getBoard()[i][j].getPieceType() != pieceType){
                antiDiagMatch = false;
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
