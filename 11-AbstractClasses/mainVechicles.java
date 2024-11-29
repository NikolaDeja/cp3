public class mainVechicles {
    public static void main(String[] args) {
        Vechicle c = new Car(4,5);
        Vechicle b = new Car(8,2);
        Vechicle t = new Car(6,3);

        System.out.println(c.Ride());
        System.out.println(b.Ride());
        System.out.println(t.Ride());
    }
}
