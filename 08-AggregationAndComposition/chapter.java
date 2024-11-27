public class chapter {
    String title;
    int number_of_pages, starting_page_number;
    public chapter(String title, int number_of_pages, int starting_page_number) {
        this.title = title;
        this.number_of_pages = number_of_pages;
        this.starting_page_number = starting_page_number;
    }
    @Override
    public String toString() {
        return "chapter [title=" + title + ", number_of_pages=" + number_of_pages + ", starting_page_number="
                + starting_page_number + "]";
    }

    
}
