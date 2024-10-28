import java.util.stream.IntStream;

public class Statistic{

    public int How_many(int x, int y){
        int count=0;
        for(int i=x; i<=y; i++){
            count++;
        }

        return count;
    }

    public int Sum(int x[]){
        int s=0;
        for(int i=0; i<x.length; i++){
            s+=x[i];
        }

        return s;
    }
    public int Mean(int x[]){
        int s=0;
        for(int i=0; i<x.length; i++){
            s+=x[i];
        }
        return s/x.length;
    }
    public static void main(String[] args){
        int[] range = IntStream.rangeClosed(5, 10).toArray();
        Statistic a=new Statistic();

        System.out.println(a.How_many(5,10));
        System.out.println(a.Sum(range));
        System.out.println(a.Mean(range));
    }
}