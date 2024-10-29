

public class Clock{
    int hour, minute, alarmHour, alarmMinute;

    public Clock(){
        hour=0;
        minute=0;
    }
    public Clock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
    }
    public void setAlarm(int alarmHour, int alarmMinute){
        this.alarmHour=alarmHour;
        this.alarmMinute=alarmMinute;
    } 
    public void setClock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
        
    }

    public String setClock(){
        String time="00:00";
        return time;
    } 
    public void displayTime(){
        if(hour<10 && minute<10)
            System.out.println("0"+hour+":"+"0"+minute);
        else if(hour<10)
            System.out.println("0"+hour+":"+minute);
        else if(minute<10)
            System.out.println(hour+":"+"0"+minute);
        else
            System.out.println(hour+":"+minute);
    }
    public void addOneMinute(){
        if(this.minute==59){
            this.hour=0;
            this.minute=0;
        }
        else
            this.minute=minute+1;
        
        if(hour==alarmHour && minute==alarmMinute){
            runAlarm();
        }
    }
    public void runAlarm(){
        System.out.println("beep-beep-beep-beep !!" );
    }
    
    public static void main(String[] args){
        Clock A= new Clock(12,47);
        A.setAlarm(0, 2);
        A.displayTime();
        A.setClock(18,14);
        A.displayTime();
        A.setClock(9,3);
        A.displayTime();
        A.setClock(23,58);
        A.addOneMinute();
        A.displayTime();
        A.addOneMinute();
        A.displayTime();
        A.addOneMinute();
        A.addOneMinute();
        A.displayTime();
        

    }
}