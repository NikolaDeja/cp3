public class Arrays {
    int[] arr1;
    int[] arr2;

    public static boolean arr(int[] arr1, int[] arr2){
        int sum1=0, sum2=0;

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>9 && arr1[i]<100){
                sum1++;
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>9 && arr2[i]<100){
                sum2++;
            }
        }
        if(sum1==sum2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1={15,8,2,37,49,117};
        int[] arr2 ={9,6,7,12,48,4,6,90,5};

        System.out.println(arr(arr1,arr2));

        
    }
}
