public class Isogram {
    public static boolean isogram(String s){
        char[] arr= s.toCharArray();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i!=j && arr[i]==arr[j])
                    {
                        return false;
                    }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isogram("red sun"));
        System.out.println(isogram("blue water"));
        System.out.println(isogram("BLUE water"));
        System.out.println(isogram("my blue water"));
    }
}
