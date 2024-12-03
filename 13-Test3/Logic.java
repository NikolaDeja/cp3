public class Logic {
    boolean[]  arr;

    public Logic(boolean[] arr) {
        this.arr = arr;
    }

    public int opposite(){
        int count=0;

        for(int i=1; i<this.arr.length-1; i++){
            if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        boolean[] a={true, false, false};
        boolean[] b={true, false, true, false};
        boolean[] c={true, false, true, true,false, true, false, true,false};
        Logic l1=new Logic(a);
        Logic l2=new Logic(b);
        Logic l3=new Logic(c);
        System.out.println(l1.opposite());
        System.out.println(l2.opposite());
        System.out.println(l3.opposite());
    }
}
