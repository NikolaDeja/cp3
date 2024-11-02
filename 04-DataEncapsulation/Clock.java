public class Clock{
    int hour, minute;

    public Clock(int hour, int minute){
        if(hour>=0 && hour<=23)
            this.hour=hour;
        if(minute>=0 && minute<=59)
            this.minute=minute;
    }

    public int addMinute(){
        if(minute==59)
            hour++;
        minute++;
        minute%=60;
        return minute;
    }

    public void display(){
        System.out.println(hour+":"+minute);
    }
}