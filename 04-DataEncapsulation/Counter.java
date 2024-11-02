public class Counter{
    private int count=0;

    public int getCount(){
        return count;
    }
    public void setCount(int count){
        this.count=count;
    }
    public int increase(){
        int temp=getCount();
        setCount(temp+=1);
        return count;
    }
    public int decrease(){
        int temp=getCount();
        setCount(temp-=1);
        return count;

    }
    public int increase(int n){
        int temp=getCount();
        setCount(temp+=n);
        return count;
    }
    public int decrease(int n){
        int temp=getCount();
        setCount(temp-=n);
        return count;
    }

    public void value(){
        System.out.println(getCount());
    }
}