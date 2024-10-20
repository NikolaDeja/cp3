public class Lamp{
    boolean lamp_switch;

    void switch_on(){
        lamp_switch=true;
        System.out.println("Lamp is on");
    }
    void switch_off(){
        lamp_switch=false;
        System.out.println("Lamp is off");
    }
    String information(){
         return lamp_switch ? "Lamp is on" : "Lamp is off";
       }
}