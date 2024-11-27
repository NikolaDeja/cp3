public class File{
    String name;
    int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String toString(){
        return this.name+" "+this.size;
    }
    
}