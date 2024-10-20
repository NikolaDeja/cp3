public class zad25{
    public static void main(String[] args)
    {
        int hours=13;
        int minutes= 47;

        System.out.println("time: "+hours+":"+minutes);

        int all_min=(int)((hours*60)+minutes);
        int all_sec=(int)(all_min*60);

        System.out.println("minutes from midnight: "+all_min);
        System.out.println("seconds from midnight: "+all_sec);

    }
}