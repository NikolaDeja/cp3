
public class MyCalendar {
    static int year=2024, month=10,day=23;

    static String myDate(){
        return String.format("%4d-%02d-%02d",year,month,day);
    }

    static int days(int month, int day){
        int all_days=0;
        for(int i=1; i<month; i++)
        {
            if(i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                all_days+=31;
            else if(i==2)
                all_days+=28;
            else
                all_days+=30;
        }
        return all_days+day;
    }

    static String monthName(int month){
        String word;
        switch (month) {
            case 1:
            word = "January";
            break;
            case 2:
            word = "February";
            break;
            case 3:
            word = "March";
            break;
            case 4:
            word = "April";
            break;
            case 5:
            word = "May";
            break;
            case 6:
            word = "June";
            break;
            case 7:
            word = "July";
            break;
            case 8:
            word = "August";
            break;
            case 9:
            word = "September";
            break;
            case 10:
            word = "October";
            break;
            case 11:
            word = "November";
            break;
            default:
            word = "December";
            break;
            }

            return word;
    }
    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(monthName(4));
        System.out.println(days(12,31));
    }
}
