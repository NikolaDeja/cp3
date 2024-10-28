public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        s.name ="John";
        s.age = 23;
        System.out.println("name: " + s.name);
        System.out.println("age: " + s.age);

        s.SayHello();
        s.displayName();
        s.displayAge();

        Student s1 = new Student();

        s1.name = "Ala";
        s1.age = 18;

        s1.SayHello();
        s1.displayName();
        s1.displayAge();

        Student s2 = new Student();

        s2.name = "Ola";
        s2.age = 19;
        s2.valid=false;
        s2.id= "231565";

        s2.SayHello();
        s2.displayName();
        s2.displayAge();
        s2.Validation();
    }
}
