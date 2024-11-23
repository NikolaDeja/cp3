public class customer {
    String name, product;
    int balance;

    public customer(String name, String product, int balance) {
        this.name = name;
        this.product = product;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void buy(int product_cost){
        balance-=product_cost;
    }
}
