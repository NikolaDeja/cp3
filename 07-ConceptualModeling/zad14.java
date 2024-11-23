public class zad14 {
    int[] scores= new int[5];

    public int score(int arr[]){
        int min=6, max=0, score=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            score+=arr[i];
        }
        
        return score-min-max;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,4,3};
        zad14 s = new zad14();
        System.out.println(s.score(arr));
    }
}
