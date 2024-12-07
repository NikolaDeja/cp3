public class C1{
    int a,c,b,d,e;
    int[] numbers = new int[5];

    public C1(int a, int c, int b, int d, int e){
        this.a = a;
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;

        numbers[0]=a;
        numbers[1]=b;
        numbers[2]=c;
        numbers[3]=d;
        numbers[4]=e;
    }


    public boolean diffrent(){
        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                if(i!=j && numbers[i]==numbers[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        C1 c= new C1(3, 4, 2, 1, 6);
        C1 c1= new C1(9,7, 4, 3, 7);

        System.out.println(c.diffrent());
        System.out.println(c1.diffrent());
    }
    

    
}