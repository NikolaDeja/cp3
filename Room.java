public class Room{
    int number, beds;
    static int takenRooms=0;
    boolean occupied;
    String guestName;


    public Room(int number){
        this.number=number;
        beds=2;
    }
     public Room(int number,int beds){
        this.number=number;
        this.beds=beds;
     }

     public void checkin(String guestName){
        this.guestName=guestName;
        occupied=true;
        takenRooms++;
     }
     public void checkout(){
        occupied=false;
        guestName=null;
        takenRooms--;
     }
     public void isOccupied(){
        System.out.println("Room occupied: "+occupied);
     }

     public void displayStatus(){
        System.out.println("Room number: "+number);
        System.out.println("Number of beds: "+beds);
        System.out.println("Room occupied: "+occupied);
        System.out.println("Guest name: "+guestName);

     }

     public static void main(String[] args){
        Room[] rooms = new Room[6];
        rooms[0]=new Room(1);
        rooms[1]=new Room(2);
        rooms[2]=new Room(3);
        rooms[3]=new Room(4,3);
        rooms[4]=new Room(5,3);
        rooms[5]=new Room(6,1);

        rooms[1].checkin("Ania");
        rooms[5].checkin("Jan");
        rooms[4].checkin("Wojtek");
        rooms[4].checkout();

        //rooms[5].displayStatus();
    
        for(int i=0; i<6; i++){
            rooms[i].displayStatus();
        }

        /* 
        for(int i=0; i<6; i++){
            if(rooms[i].beds==2)
                rooms[i].displayStatus();
        }
        */

        System.out.println("Number of taken rooms: "+takenRooms);
        System.out.println("Number of free rooms: "+(6-takenRooms));
     }
     

}   