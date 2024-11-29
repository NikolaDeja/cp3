public class Email extends Message{
    String subject, adress;

    

    public Email(String subject, String adress) {
        this.subject = subject;
        this.adress = adress;
    }


    public Email(String message, String subject, String adress) {
        super(message);
        this.subject = subject;
        this.adress = adress;
    }



    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    String send(){return message+charNumber();}
}
