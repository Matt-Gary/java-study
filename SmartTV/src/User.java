public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        smartTv.turnOn();

        smartTv.increaseVolume();
        smartTv.increaseVolume();
        smartTv.increaseVolume();
        
        smartTv.changeChannel(13);
        smartTv.increaseChannel();
        smartTv.decreaseChannel();
        
        smartTv.turnOff();
                System.out.println("New state -> TV turn on? " + smartTv.stateTv);

    }
}
