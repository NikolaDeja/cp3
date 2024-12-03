public class Person{
    String name, surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        char n = this.name.charAt(0);
        char s = this.surname.charAt(0);
        n-=32;
        s-=32;
        String wynik="";
        wynik+=n;
        wynik+=s;
        return wynik;
    }

    public static void main(String[] args) {
        Person p = new Person("anna", "may");

        System.out.println(p.toString());
    }
}