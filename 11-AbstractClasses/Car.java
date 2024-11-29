public class Car extends Vechicle{
    int doors;

    public Car(int v, int doors) {
        super(v);
        this.doors = doors;
    }
 
    String Ride(){return "Car is riding and has "+wheels+"wheels";}
}
