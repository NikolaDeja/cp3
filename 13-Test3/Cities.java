public class Cities {
    String[] arr;

    public Cities(String[] arr) {
        this.arr = arr;
    }

    public Cities filter(char a){
        String[] b=new String[100];
        int index=0;
        for(int i=0; i<this.arr.length; i++){
            if(arr[i].charAt(0)==a)
            {
                b[index]=arr[i];
                index++;
            }
        }
        Cities c= new Cities(b);
        return c;
    }

    public String cities(){
        String w="";
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=null){
                w+=arr[i];
            }
            else{
                break;
            }
        }
        return w;
    }

    public static void main(String[] args) {
        String[] s= {"Warszawa", "Sopot", "Krakow", "Szczecin"};
        Cities c= new Cities(s);
        System.out.println(c.filter('S').cities());
    }
}
