public class zad24{
    public static void main(String[] args)
    {
        double buy=4.5940;
        double sell=4.6250;

        double diff= Math.abs(buy-sell);

        System.out.println("Bank buys EUR:"+buy);
        System.out.println("Bank sells EUR:"+sell);
        System.out.println("Spread: "+ Math.floor(diff * 10000) / 10000);

    }
}