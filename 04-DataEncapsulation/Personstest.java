public class Personstest{
    public static void main(String[] args){
        Person p = new Person("Anna",21);
        System.err.println(p.getAge());
        System.err.println(p.isAdult());
        p.setAge(17);
        System.err.println(p.isAdult());
        System.err.println(p.toString());

    }
}