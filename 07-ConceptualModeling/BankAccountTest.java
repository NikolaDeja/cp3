public class BankAccountTest {
    public static void main(String[] args) {
        zad8 bank = new zad8();
        bank.deposit(500);
        System.out.println(bank.getBalance());
        bank.deposit(200);
        System.out.println(bank.getBalance());
        bank.withdraw(800);

        for(int i=0; i<3; i++){
            System.out.println(bank.transactions[i]);
        }
        
    }
}
