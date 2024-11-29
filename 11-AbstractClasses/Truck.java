public class Truck extends Vechicle{
    int doors;

    public Truck(int v, int doors) {
        super(v);
        this.doors = doors;
    }
 
    String Ride(){return "Truck is riding and has "+wheels+"wheels";}
}
