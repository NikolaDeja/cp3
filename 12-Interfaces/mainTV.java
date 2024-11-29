public class mainTV extends TV {
    public static void main(String[] args) {
        TV tv= new TV();

        tv.display();
        tv.On();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.display();
        tv.channelDown();
        tv.volumeDown();
        tv.display();
        tv.Off();
        tv.display();
    }
}
