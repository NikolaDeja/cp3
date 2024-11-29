public class mainShapes {
    public static void main(String[] args) {
        shape r= new rectangle(2,3);
        shape t= new triangle(2,7,3,4);
        shape c= new circle(5);

        System.out.println(r.area());
        System.out.println(t.area());
        System.out.println(c.area());
        System.out.println(r.perimeter());
        System.out.println(t.perimeter());
        System.out.println(c.perimeter());
    }
}
