public class zad8{
    private String account_number, name;
    private int balance=0;
    int[] transactions= new int[3];
    static int count=0;

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int money){
        this.balance+=money;
        transactions[count]=money;
        count++;
        if(count==2){
            count=0;
        }
    }
    public void withdraw(int money){
        if(money>500 || money>this.balance){
            System.out.println("withdraw only up to 500 or not enough money");
        }
        else{
            this.balance-=money;
            transactions[count]=money;
            count++;
            if(count==2){
                count=0;
        }
        }
    } 

}