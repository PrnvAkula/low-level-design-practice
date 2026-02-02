public class Remote {
    private Command onCommand;
    private Command offCommand;
    private Command changeChannel;
    private Command adjustVolume;
    

    public void setOnCommand(Command onCommand){
        this.onCommand = onCommand;
    }

    public void setOffCommand(Command offCommand){
        this.offCommand = offCommand;
    }

    public void setChangeChannel(Command changeChannel){
        this.changeChannel = changeChannel;
    }

    public void setAdjustVolume(Command adjustVolume){
        this.adjustVolume = adjustVolume;
    }

    public void pressOnButton(){
        onCommand.execute();
    }

    public void pressOffButton(){
        offCommand.execute();
    }

    public void pressVolumeButton(){
        adjustVolume.execute();
    }

    public void pressChannelButton(){
        changeChannel.execute();
    }
}
