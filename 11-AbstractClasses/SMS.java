public class SMS extends Message{
    String phone_number;
    User u;

    public SMS(User u){
        super();
        this.u=u;

    }

    public SMS(String message, User u) {
        super(message);
        this.u=u;
    }


    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    String send(){return message+charNumber();}

}
