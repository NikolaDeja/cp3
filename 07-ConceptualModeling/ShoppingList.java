import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    List<String> list=new ArrayList<String>();
    static int nr_on_list=0;

    public void display(){
        for(String s: list){
            System.out.print(s+", ");
        }
        System.out.println();
    }
    public void display_nr(){
        System.out.println(nr_on_list);
    }

    public void add(String n){
            list.add(n);
        nr_on_list++;

    }


    public static void main(String[] args) {
        ShoppingList s= new ShoppingList();
        Scanner n = new Scanner(System.in);
        String product = n.nextLine(); 
        s.display();
        s.display_nr();
        s.add(product);
        s.add("jajka");
        s.add("parowki");
        s.display();
        s.display_nr();
        s.add("kurczak");
        s.display();
        s.display_nr();
    }
}
