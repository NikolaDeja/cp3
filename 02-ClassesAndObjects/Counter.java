public class Counter{
    int a=0;

    int reset(){
        return a=0;
    }

    int add1(){
        return a++;
    }
    int subtract1(){
        return a--;
    }
    int add10(){
        return a+=10;
    }
    int subtract10(){
        return a-=10;
    }
    void show(){
        System.out.println(a);
    }
}