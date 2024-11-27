public class main {
    public static void main(String[] args) {
        Publisher p= new Publisher("Darek", "poznan");
        Writer w = new Writer("a","b" ,"c");
        Book a = new Book("harry","rowling",2010, p,w);
        Ebook b = new Ebook("tadeusz", "mickiewicz",1670,p, "abc",w);
        Ebook c = new Ebook("potop", "sienkiewicz",1890,p,"def",w);
        Audiobook d= new Audiobook("tadeusz", "mickiewicz",1870,p, 60,58,w);
        Audiobook e = new Audiobook("potop", "sienkiewicz",1560,p, 40, 25,w);

        a.display();
        b.display();
        c.display();
        d.display();
        e.display();

        Library library= new Library();
        library.addBook(a);
        library.addBook(b);
        library.addBook(c);
        library.addBook(d);
        library.addBook(e);

        for(Book x: library.arr){
            x.display();
        }
       
    }
}
