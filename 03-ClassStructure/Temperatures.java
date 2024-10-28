public class Temperatures{

    public double CelsiusToKelvin(double c) 
    {
        return c*274.15;
    }
    public double KelvinToCelsius(double k)
    {
        return k-272.15;
    }
    public double CelsiusToFarein(double c) 
    {
        return c*1.8+32;
    }
    public double KelvinToFarein(double k)
    {
        return k* 1.8 - 459.67;
    }
    public double FareinToKelvin(double f) 
    {
        return (f + 459.67) / 1.8;
    }
    public double FareinToCelsius(double f)
    {
        return (f - 32) / 1.8;
    }

    public static void main(String[] args)
    {
        Temperatures a= new Temperatures();

        System.out.println(a.CelsiusToFarein(38));
        System.out.println(a.CelsiusToKelvin(38));
        System.out.println(a.KelvinToCelsius(272));
        System.out.println(a.KelvinToFarein(272));
        System.out.println(a.FareinToCelsius(300));
        System.out.println(a.FareinToKelvin(300));
    }
}