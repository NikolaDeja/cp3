import java.util.ArrayList;

public class Folder {

    ArrayList<File> list = new ArrayList<File>();
    String Name;

    public void add_file(File f){
        list.add(f);
    }
    public void remove_file(File f){
        list.remove(f);
    }

    public void display(){
        System.out.println(list);
        //list.forEach(System.out :: println);
        // for(int i=0; i<list.size(); i++){
        //     File current = list.get(i);
        //     System.out.println(current);
        // }
        // System.out.println();

        // for(File i: list){
        //     System.out.println(i);
        // }
    }

}
