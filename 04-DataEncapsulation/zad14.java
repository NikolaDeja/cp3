public class zad14{
    public static void main(String[] args){

        String text="Have a nice day!";

        System.out.println(text.length());
        System.out.println(text.substring(0, 9));
        System.out.println(text.endsWith("day!"));
        System.out.println(text.isEmpty());
        System.out.println(text.lastIndexOf("e"));
        System.out.println(text.replaceAll(" ","-"));
        System.out.println(text.toUpperCase());
        
    }
}