public class Family extends Person{
    Person[] family;

    public Family(String n, int a, Person[] family) {
        super(n, a);
        this.family = family;
    }

    public int Adults(){
        int count=0;
        for(int i=0; i<family.length; i++){
            if(family[i].getAge()>17){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Person p1= new Person("mama", 45);
        Person p2= new Person("tata", 47);
        Person p3= new Person("Babcia", 77);
        Person p4= new Person("Dziadek", 80);
        Person p5= new Person("Córka", 8);
        Person p6= new Person("Syn", 3);

        Person[] family= {p1,p2,p3,p4,p5,p6};

        Family f= new Family(null, 0, family);

        System.out.println(f.Adults());
    }
}
