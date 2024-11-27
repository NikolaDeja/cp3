import java.util.ArrayList;

public class books {
    String name;
    int pages;
    ArrayList<chapter> chapters = new ArrayList<chapter>();

    public void add_chapter(chapter c){
        chapters.add(c);
    }
    public books(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    @Override
    public String toString() {
        return "books [name=" + name + ", pages=" + pages + ", chapters=" + chapters + "]";
    }

    
}
