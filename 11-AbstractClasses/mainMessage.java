public class mainMessage {
    public static void main(String[] args) {
        User u = new User("MAREK","Der","abc@gmail.com","4567893");
        Message n= new SMS("abc",u);
        Message a= new SMS("abcd",u);
        Message b= new Email("","haha","23145689");
        Message c= new Email("ihi","hihi","23145689");

        System.out.println(n.send());
        System.out.println(a.send());
        System.out.println(b.send());
        System.out.println(c.send());

    }
}
