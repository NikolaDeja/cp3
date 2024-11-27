public class Writer {
    String first_name, last_name, genre;

    public Writer(String first_name, String last_name, String genre) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.genre = genre;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
