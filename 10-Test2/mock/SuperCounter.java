public class SuperCounter extends Counter{
    int k;
    public SuperCounter(int c){
        super(c);
        
    }
    public void addN(int n){
        for(int i=0; i<n; i++)
        {
            add1();
        }
    }

    public static void main(String[] args) {
        SuperCounter s= new SuperCounter(5);

        s.addN(5);
        System.out.println(s.getCounter());
    }
}
