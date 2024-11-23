public class sales {
    public static void main(String[] args) {
        seller s =new seller(1, 23000, "Marek");
        customer c = new customer("Jacek", "marchewka", 43);
        product p = new product("carrot", "20.12.2024", 1, 14);

        System.out.println("Your seller " +s.getName());
        System.out.println("product u want to but " +p.getName());
        System.out.println("cost of the product " +p.getPrice());
        System.out.println("How much money u have " +c.getBalance());
        c.buy(p.getPrice());
        System.out.println("How much money u have after buying " + c.getBalance());
    }
}
