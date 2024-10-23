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
