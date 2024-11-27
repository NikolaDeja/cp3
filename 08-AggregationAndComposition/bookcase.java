import java.util.ArrayList;

public class bookcase {

    ArrayList<books> shelf = new ArrayList<books>();

    public void add(books b){
        shelf.add(b);
    }

    public void remove(books b){
        shelf.remove(b);
    }

    public void display(){
        System.out.println(shelf);
    }

    public static void main(String[] args) {
        bookcase s = new bookcase();
        chapter c= new chapter("abc",50,3);
        books b1 = new books("harry potter", 230);
        books b2 = new books("pan tadeusz", 450);

        s.display();
        s.add(b1);
        b1.add_chapter(c);        s.add(b2);
        s.display();
        s.remove(b1);
        s.display();
    }
}
