public class AdjustVolumeCommand implements Command{
    private Tv tv;
    private int volume;

    public AdjustVolumeCommand(Tv tv, int volume){
        this.tv = tv;
        this.volume = volume;
    }

    @Override
    public void execute(){
        tv.adjustVolume(volume);
    }
}
