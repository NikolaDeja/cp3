<<<<<<< HEAD

public class SurfaceArea{

    public int cuboid(int a, int b, int h){
        return a*b*h;
    }
    public int sphere(int r){
        return (int) (4*Math.PI*r*r);
    }
    public int cuboid(int r, int l){
        return (int) (Math.PI*r*(r-l));
    }

}
=======
public class SurfaceArea {
    static float rectangle(float a, float b){
        return a*b;
    }

    static float tiangle(float a, float h){
        return (float) (0.5*a*h);
    }

    static float circle(double r){
        return (float) (Math.PI*Math.pow(r,2));
    }
}
>>>>>>> 0b14c39108a4da247fabba65e0f0d2dda888af86
