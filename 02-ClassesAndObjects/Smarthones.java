public class Smarthones{
    String brand, color, os; //os-operatinmg system
    int memory_GB;
    boolean is_on;

    void show_brand()
    {
        System.out.println("Brand: "+ brand);
    }
    void increse_memory(){
        int incresd=memory_GB*2;
        System.out.println("Incresed memory times 2: "+incresd);
    }

    void it_is_on()
    {
        if(is_on){
            System.out.println("Smartphone is on");
        }
        else{
            System.out.println("Smartphone is off");
        }
    }
}