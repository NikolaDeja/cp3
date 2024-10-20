public class Books{
    String title, author;
    int pages_read, read_today;

    void show_title()
    {
        System.out.println("Titel of the book: "+ title);
    }
    void increse_pages(){
        int incresd=pages_read+read_today;
        System.out.println("Number of pages ag=fter today: "+incresd);
    }
}