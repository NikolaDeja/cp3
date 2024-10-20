public class zad30{
    public static void main(String[] args)
    {
        Counter a= new Counter();
        Counter b= new Counter();

        a.add10();
        a.add10();
        a.add1();
        a.add1();
        a.add1();

        b.subtract10();
        b.subtract10();
        b.subtract10();
        b.subtract10();
        b.subtract1();
        b.subtract1();
        b.subtract1();
        b.subtract1();
        b.subtract1();
        b.subtract1();
        b.subtract1();
        
        a.show();
        b.show();
    }
}