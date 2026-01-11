import enums.GameStatus;

public class PlayGame {
    public static void main(String[] args){
        System.out.println("\n===>>> TicTacToe Game\n");
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();

        GameStatus status = game.startGame();
        
        System.out.print("\n===>>> GAME OVER: ");

        switch(status){
            case WIN:
                System.out.println(game.getWinner().getName() + " is the winner.");
                break;
            case DRAW:
                System.out.println("Game is a draw");
                break;
            default:
                System.out.println("Game Ends");
                break;
        }
    }
}
