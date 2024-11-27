public class Book{
    private String title, author;
    Publisher p;
    int year;
    Writer w;

    public Book(String title, String author, int year, Publisher p, Writer w){
        this.title= title;
        this.author=author;
        this.year=year;
        this.p=p;
        this.w=w;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println(this.title+" "+this.author+" "+this.year+"Writer:"+w.getFirst_name()+" "+w.getLast_name()+w.getGenre()+" publisher: "+p.getName()+" "+p.getCity());
    }



   

}