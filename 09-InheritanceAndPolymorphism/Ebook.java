public class Ebook extends Book{
    
    String file_name;

    public Ebook(String title, String author,int year,Publisher p, String file_name, Writer w) {
        super(title, author, year, p,w);
        this.file_name = file_name;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public void display(){
        System.out.println(getTitle()+" "+getAuthor()+" "+getFile_name()+" "+getYear()+" publisher: "+p.getName()+" "+p.getCity());
    }

   
    

}
