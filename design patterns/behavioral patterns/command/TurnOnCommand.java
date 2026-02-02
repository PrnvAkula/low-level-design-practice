public class TurnOnCommand implements Command {
    private Tv tv;

    public TurnOnCommand(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.turnOn();
    }
}
