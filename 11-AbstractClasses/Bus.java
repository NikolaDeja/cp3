public class Bus extends Vechicle {
    int doors;

    public Bus(int v, int doors) {
        super(v);
        this.doors = doors;
    }
 
    String Ride(){return "Bus is riding and has "+wheels+"wheels";}
}
