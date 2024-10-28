import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentGrades {

    String studentName;
    double[] grades;

    Random rand= new Random();

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public StudentGrades(String name, int numberOfGrades){
        studentName=name;
        double[] grades=new double[numberOfGrades];
        for(int i=0; i<numberOfGrades; i++){
            grades[i]= rand.nextDouble();
        }
    }
    public StudentGrades(String name){
        studentName=name;
        ArrayList<Double> grade = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter grade: ");
            double enterValue = input.nextDouble();

            if(enterValue == -1)
                return;
                
            grade.add(enterValue);
        }
    }


    public double lowest(double[] grades){
        double lowest=5.0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]<lowest)
                lowest=grades[i];
        }
        return lowest;
    }
    public double highest(double[] grades){
        double highest=0.0;
        for(int i=0; i<grades.length; i++){
            if(grades[i]>highest)
            highest=grades[i];
        }
        return highest;
    }
    public int numberOfGrades(double[] grades){
        return grades.length;
    }
    public double averageOfGrades(double[] grades){
        double sum=0;
        for(int i=0; i<grades.length; i++)
        {
            sum+=grades[i];
        }
        double average=sum/grades.length;
        return average;
    }

    public void displayData(){
        System.out.println("Name: "+studentName);
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Lowest grade: "+lowest(grades));
        System.out.println("Highest grade: "+highest(grades));
        System.out.println("Average: "+averageOfGrades(grades));
    }

    public static void main(String[] args) {
        double[] gradesb={2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades Amanda = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades James = new StudentGrades("James", gradesb);
        StudentGrades Karol = new StudentGrades("Karol");
        Amanda.displayData();
        James.displayData();
        
    }
}
