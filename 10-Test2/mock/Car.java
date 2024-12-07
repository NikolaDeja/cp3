public class Car extends Vehicle{
    int max_speed;

    public Car(int s, int max_speed) {
        super(s);
        this.max_speed = max_speed;
    }

    public int[] spec(){
        int[] spec= new int[2];
        spec[0]=getSeats();
        spec[1]=max_speed;

        return spec;
    }

    public static void main(String[] args) {
        Car c= new Car(5, 220);

        System.out.println(c.spec());
    }
}
