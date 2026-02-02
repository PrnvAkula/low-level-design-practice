public class Main {
    public static void main(String[] args){
        Tv tv = new Tv();
        Remote remote = new Remote();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command adjustVolume = new AdjustVolumeCommand(tv, 24);
        Command changeChannel = new ChangeChannelCommand(tv, 34);

        remote.setOnCommand(turnOn);
        remote.setOffCommand(turnOff);
        remote.setAdjustVolume(adjustVolume);
        remote.setChangeChannel(changeChannel);

        remote.pressOnButton();
        remote.pressChannelButton();
        remote.pressVolumeButton();
        remote.pressOffButton();
    }
}
