import java.util.Arrays;

public class Product implements Comparable {
    String name;
    float price;

    

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return name+" "+price+"/n";
    }

    public String comparable(Product arr[]){
        Arrays.sort(arr);
        String wynik="";
        // String[] names= new String[arr.length];
        // for(int i=0; i<arr.length; i++){
        //     names[i]=arr[i].name;
        // }
        // Arrays.sort(names);

        for(int i=0; i<arr.length; i++){
            wynik+=arr[i].toString();
        }
        return wynik;

    }

    public static void main(String[] args) {
        Product a= new Product("marchew",12);
        Product b= new Product("tv",177);
        Product c= new Product("hibiskus",5);

        Product[] arr= {a,b,c};

        a.comparable(arr);
    }
}
