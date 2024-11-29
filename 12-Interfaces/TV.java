public class TV implements CanOnOff,CanChangeChanel {
    boolean working=false;
    int chanel=1;
    int volume=1;
 
    public void On(){working=true;}
    public void Off(){working=false;}

    public void display(){
        if(working){
            System.out.println("TV is on, on chanel "+chanel+ ", volume set to "+volume);
        }
        else{
            System.out.println("TV is off");
        }
    }
    
    public void setChannel(int chanel){
        if (working && chanel>0 &&chanel<99) {
            this.chanel=chanel;
        };}
    public void channelDown(){
        if(working){
            chanel--;
        };}

    public void channelUp(){
        if(working){
            chanel++;
        };}

    public void volumeUp(){
        if(working && this.volume>0 && this.volume<11){
            this.volume++;
        };}
    public void volumeDown(){
        if(working && this.volume>0 && this.volume<11){
            this.volume--;
        };}
}
