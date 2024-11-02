public class Booktest{
    public static void main(String[] args){
        Book b = new Book();
        b.setPages(3);
        b.setPages(-4);
        System.out.println(b.getPages());

    }
}