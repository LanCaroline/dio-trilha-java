public class SmartTv {
    private boolean powerOnAndOf = false;
    private int channel = 1;
    private int volume = 25;

    public void setPowerOnAndOf(boolean powerOnAndOf){
        this.powerOnAndOf = powerOnAndOf;
    }

    public boolean getPowerOnAndOf(){
        return powerOnAndOf;
    }

    public void setChangeVolumeMore(){
        volume++;
    }

    public void setChangeVolumeLess(){
        volume--;
    }

    public int getVolume(){
        return volume;
    }


    public void setChangeChannelMore(){
        channel++;
    }

    public void setChangeChannelLess(){
        channel--;
    }

    public void setChangeChannel(int newChannel){
        this.channel = newChannel;
    }

    public int getChannel(){
        return channel;
    }





}
