public class MyArray{
    public static int odd(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0 && arr[i]%2!=0)
                count++;
        }
        return count;
    }
    public static int above(int[] arr){
        int sum_av=0, average, sum=0;
        for(int i=0; i<arr.length; i++){
            sum_av+=arr[i];
        }
        average=sum_av/arr.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>average)
                sum+=arr[i];
        }
        return sum;
    }

}