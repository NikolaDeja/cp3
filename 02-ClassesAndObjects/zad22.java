public class zad22
{
    public static void main(String[] args)
    {
        int height_cm;
        height_cm=164
        ;

        int height_feet= (int) (height_cm  *0.0328);
        int pom= (int)(height_cm -(height_feet*30.48));
        System.out.println(pom);
        int height_inch=(int) (pom /2.54);
            
        System.out.println("I am "+height_cm+", i.e "+height_feet+" feet and "+height_inch+" inches");

    }
}