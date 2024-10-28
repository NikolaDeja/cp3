
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