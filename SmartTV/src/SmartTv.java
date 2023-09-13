public class SmartTv {
    boolean stateTv = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Change channel to: " + channel);
    }

    public void increaseChannel() {
        channel++;
        System.out.println("Change channel to: " + channel);
   }
   
    public void decreaseChannel() {
        channel--;
        System.out.println("Change channel to: " + channel);
   }
   
   
    public void increaseVolume() {
        volume++;
        System.out.println("Increase volume to: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Decrease volume to: " + volume);
    }

    public void turnOn() {
        stateTv = true;
    }

    public void turnOff() {
        stateTv = false;
    }
}
