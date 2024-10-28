public class InternetDevice{
    String name;
    boolean connected;
    static int connectedDevices=0;

    public InternetDevice(String diviceName){
        name=diviceName;
    }
    public void connect(){
        connected=true;
        connectedDevices++;
    }
    public void disconnect(){
        connected=false;
        connectedDevices--;
    }
    public boolean isConnected() {
        return connected;
    }
    public void displayStatus(){
        System.out.println("Divice is connected: "+connected);
    }
    public static void displatConnections(){
        System.out.println("Divices that are connected to the internet: "+connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice laptop=new InternetDevice("Jas");
        InternetDevice phone=new InternetDevice("Stas");
        InternetDevice tv=new InternetDevice("Marysia");
        InternetDevice pc=new InternetDevice("Zuzia");
        InternetDevice radio=new InternetDevice("Kazio");

        laptop.connect();
        phone.connect();
        pc.connect();

        laptop.displayStatus();
        phone.displayStatus();
        tv.displayStatus();
        pc.displayStatus();
        radio.displayStatus();

        displatConnections();
    }
}