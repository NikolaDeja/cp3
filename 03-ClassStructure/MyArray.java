import java.util.Arrays;

public class MyArray{
    public int even(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0)
                count++;
        }
        return count;
    } 
    public int positiveOdd(int[] array){
        int count=0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2 != 0 && array[i]>0)
                count++;
        }
        return count;
    } 
    public void reverse(int[] array){
        int[] A = new int[array.length];
        int j=0;
        for(int i=array.length-1; i>=0; i--){
            A[j]=array[i];
            j++;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < array.length; k++) {
            System.out.println(A[k]);
        } 
    }
    public boolean compare(int[] array1, int[] array2){
        if(array1.length!=array2.length)
            return false;
        for(int i=0; i<array1.length; i++){
            if(array1[i]!=array2[i])
                return false;
        }
        return true;
    }
    public String different(int[] array1, int[] array2){
        int count=0;
        String wynik="";
        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2.length; j++){
                if(array1[i]!=array2[j])
                    count++;
            }
            if(count==array1.length)
                wynik+=array1[i]+",";
            count=0;
        }
        return wynik;
    }
    public boolean exist(int number, int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]==number)
                return true;
        }
        return false;
    }

    public int secondMax(int[] array){
        Arrays.sort(array);
        
        return array[array.length-2];
    }

    public int lastColumn(int[][] array){
        int sum=0;

        for(int i=0;i<array.length;i++){
            sum+=array[i][array[0].length-1];
        }
        return sum;
    }
    public void swap(int[][] array){
        for(int i=0; i<array.length; i++){
            array[i][0]=array[i][array[0].length-1];

            array[i][array[0].length-1]=array[i][0];

        }
        for (int[] x : array)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public void two2one(int[][] array){
        int[] oneDArray = new int[array.length * array[0].length];
        for(int i = 0; i < array.length; i ++)
        {
            for(int j = 0; j < array[0].length; j ++)
            {
            oneDArray[(i * array[0].length) + j] = array[i][j];
            }
        }
        for(int i=0; i<oneDArray.length; i++){
            System.out.println(oneDArray[i]);
        }

    }
    public static void main(String[] args){
        MyArray M= new MyArray();
        int[] A={1,2,3,4,5};
        int[] B={6,7,8,9,10};
        int[][] C={{1,2,3,4},{1,2,3,4}};
        
        System.out.println(M.even(A));
        System.out.println(M.positiveOdd(A));
        M.reverse(A);
        System.out.println(M.compare(A,B));
        System.out.println(M.different(A,B));
        System.out.println(M.exist(4, A));
        System.out.println(M.secondMax(A));
        System.out.println(M.lastColumn(C));
        M.swap(C);
        M.two2one(C);

    }
}