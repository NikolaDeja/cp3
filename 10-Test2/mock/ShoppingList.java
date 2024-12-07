import java.util.ArrayList;

public class ShoppingList extends Product {
    ArrayList<Product> list = new ArrayList<>();

    public ShoppingList(String n, int q) {
        super(n, q);
        
    }
    public void add(Product product){
        list.add(product);
    }

    public int total(){
        int t=0;
        for(int i=0; i<list.size(); i++){
            t+=list.get(i).getQuantity();
        }
        return t;
    }
    public String toString(){
        String wynik="";
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i).getName()!=list.get(i+1).getName()){
                wynik+=list.get(i).getName();
                wynik+=",";
                wynik+=list.get(i+1).getName();
            }
        }
        return wynik;
    }

    public static void main(String[] args) {
        Product milk= new Product("milk", 2);
        Product apple= new Product("apple", 4);

        ShoppingList s= new ShoppingList(null, 0);

        s.add(milk);
        s.add(apple);

        System.out.println(s.toString());
        System.out.println(s.total());
    }
}
