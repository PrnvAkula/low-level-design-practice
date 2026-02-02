public class ChangeChannelCommand implements Command {
    private Tv tv;
    private int channel;

    public ChangeChannelCommand(Tv tv, int channel){
        this.tv = tv;
        this.channel = channel;
    }

    @Override
    public void execute(){
        tv.changeChannel(channel);
    }
}
