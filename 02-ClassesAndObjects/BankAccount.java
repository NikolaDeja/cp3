public class BankAccount{
    String name, age;
    int balance, salary;
    boolean loan;

    void show_name()
    {
        System.out.println("User name: "+ name);
    }
    void increse_ballance(){
        int incresd=balance+salary;
        System.out.println("Balance incresed by salary "+incresd);
    }

    void has_loan()
    {
        if(loan){
            System.out.println("User has a loan");
        }
        else{
            System.out.println("User has not have a loan");
        }
    }
}