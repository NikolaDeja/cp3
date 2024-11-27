public class C3{
    public static boolean isAlphabet(String t){
        for(int i=0; i<t.length(); i++){
            if(i!=t.length()-1 && t.charAt(i)>t.charAt(i+1)){
                return false;
            }
        }
        return true;
    }

    public static String hideText(String t){
        char arr[]=t.toCharArray();
        String wynik="";
        for(int i=0; i<t.length(); i++){
            if(i==0 || i==t.length()-1){
                wynik+=arr[i];
            }
            else{
                arr[i]='*';
                wynik+=arr[i];
            }
        }
        return wynik;
    }
    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));

    }
}