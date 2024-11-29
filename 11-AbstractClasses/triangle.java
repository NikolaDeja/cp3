public class triangle extends shape{
    int a, h,b ,c ;


    public triangle(int a, int h, int b, int c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }
    double area(){return a*h/2;}
    double perimeter(){return a+b+c;}
}
