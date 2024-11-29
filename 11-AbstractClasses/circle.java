public class circle extends shape {

    int r;

    public circle(int r) {
        this.r = r;
    }


    double area(){return r*r*Math.PI;}
    double perimeter(){return Math.PI*r*2;}
}
