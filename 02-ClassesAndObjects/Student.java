public class Student{
    String name, id;
    int age, semester;
    boolean valid;
    double average;


    void SayHello(){
        System.out.println("Hello from " + name);
    }

    void displayName(){
        System.out.println(name);
    }

    void displayAge(){
        System.out.println(age);
    }

    void data(){
        System.out.println("Name: " +name);
        System.out.println("Semester: " +semester);
        System.out.println("Average grade: " +average);
    }

    void Validation(){
        if(valid == true){
            System.out.println("Status of ID card: invalid");
        }
        else{
            System.out.println("Status of ID card: valid");
        }

    }


}
