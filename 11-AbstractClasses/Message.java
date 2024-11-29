abstract class Message {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message() {
        this.message="";
    }

    public Message(String message) {
        this.message = message;
    }
    
    public int charNumber(){
        return this.message.length();
    }
    
    abstract String send();
}
