public class CounterTest{
    public static void main(String[] args){
        Counter c = new Counter();
        c.value();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        c.value();

    }
}