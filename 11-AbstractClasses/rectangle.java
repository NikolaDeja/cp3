public class rectangle extends shape{
    int a,b;
    
    public rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    double area(){return a*b;}
    double perimeter(){return (2*a)+(2*b);}
}
