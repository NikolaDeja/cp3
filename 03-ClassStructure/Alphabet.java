import java.util.Arrays;

public class Alphabet{
    static final String alphabet ="abcdefghijklmnopqrstuwvxyz";
    public static boolean isAlphabet(String t){
        int index = 0;
        char[] charArray = t.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            int tempIndex = alphabet.indexOf(charArray[i]);

            if(tempIndex < index)
                return false;

            index = tempIndex;
        }
        return true;

        // char tempArray[] = t.toCharArray();
        // Arrays.sort(tempArray);
        // String sortedString = new String(tempArray);

        // return sortedString.equals(t);
    } 

    public static void main(String[] args) {
        System.out.println(isAlphabet("acbc"));
    }
}