public class Numbers implements Ok{
    int[] arr;

    public Numbers(int[] arr) {
        super();
        this.arr = arr;
    }
    public boolean ok(){
        for(int i=0; i<arr.length; i++){
            if((i%2==0 && arr[i]%2==0)||(i%2!=0 && arr[i]%2!=0)){
                
            }
            else{
                return false;
            }
        }
        return true;
    };
    
    public static void main(String[] args) {
        int[] a={6,7,6,1,4};
        int[] b={6,7,6,8,4};

        Numbers n= new Numbers(a);
        Numbers m= new Numbers(b);

        System.out.println(n.ok());
        System.out.println(m.ok());
    }
}
