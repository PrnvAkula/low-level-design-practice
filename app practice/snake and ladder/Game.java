import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> players;
    private Player winner;

    public Game(){
        initialize();
    }

    private void initialize(){
        board = new Board(100, 5, 4);
        dice = new Dice();
        winner = null;
        players = new LinkedList<>();

        Player player1 = new Player(1);
        player1.setPosition(1);
        Player player2 = new Player(2);
        player2.setPosition(1);

        players.add(player1);
        players.add(player2);
    }

    public void startGame(){
        while(winner == null){
            Player currentPlayer = findPlayerTurn();
            System.out.println("\nPlayer turn: " + currentPlayer.getId() + ". Current positon: " + currentPlayer.getPosition() + "\n");
            int diceRoll = dice.rollDice();
            System.out.println("\nDice is rolled. Result: " + diceRoll + "\n");

            int newPosition = board.getNextPosition(currentPlayer.getPosition(), diceRoll);
            currentPlayer.setPosition(newPosition);
            System.out.println("\nPlayer : " + currentPlayer.getId() + "'s new position is: " + newPosition + "\n");

            if(newPosition == board.getSize()) winner = currentPlayer;
        }

        System.out.println("\nWinner is: " + winner.getId() + "\n");
    }

    private Player findPlayerTurn(){
        Player currentPlayer = players.removeFirst();
        players.addLast(currentPlayer);
        return currentPlayer;
    }
}
