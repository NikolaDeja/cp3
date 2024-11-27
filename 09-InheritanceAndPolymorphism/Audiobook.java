public class Audiobook extends Book{
    int minutes, seconds;

    public Audiobook(String title, String author, int year,Publisher p, int minutes, int seconds, Writer w) {
        super(title, author, year,p,w);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){
        System.out.println(getTitle()+" "+getAuthor()+" "+getYear()+" "+this.minutes+" "+this.seconds+" publisher: "+p.getName()+" "+p.getCity());
    }

    
}
