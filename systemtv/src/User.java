import java.io.FilterOutputStream;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("is it on = "+smartTv.getPowerOnAndOf());
        System.out.println("channel = "+smartTv.getChannel());
        System.out.println("volume = "+smartTv.getVolume());

        System.out.println("=============================");

        smartTv.setPowerOnAndOf(true);

        System.out.println("is it on = "+smartTv.getPowerOnAndOf());
        smartTv.setChangeChannelMore();
        smartTv.setChangeVolumeMore();
        smartTv.setChangeVolumeMore();
        smartTv.setChangeVolumeMore();
        smartTv.setChangeVolumeMore();
        System.out.println("volume = "+smartTv.getVolume());

        smartTv.setChangeVolumeLess();
        System.out.println("volume = "+smartTv.getVolume());

        smartTv.setChangeChannel(13);
        System.out.println("channel = "+smartTv.getChannel());

        smartTv.setChangeVolumeLess();
        smartTv.setChangeVolumeLess();
        smartTv.setChangeChannelLess();
        smartTv.setChangeChannelLess();
        smartTv.setChangeChannelLess();
        System.out.println("channel = "+smartTv.getChannel());
        System.out.println("volume = "+smartTv.getVolume());

    }

}
