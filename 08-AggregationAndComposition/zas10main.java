public class zas10main {
    public static void main(String[] args) {
        Folder F = new Folder();
        File f1 = new File("a", 2);
        File f2 = new File("b",3);
        File f3 = new File("c",4);

        F.display();
        F.add_file(f1);
        F.add_file(f2);
        F.display();
        F.add_file(f3);
        F.display();
        F.remove_file(f3);
        F.display();
    }
}
