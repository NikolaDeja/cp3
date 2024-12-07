import java.util.ArrayList;

public class Cities {
    String [] cities;
    ArrayList<String> s= new ArrayList<>();

    public Cities(String[] cities) {
        this.cities = cities;
    }

    public void filter(char c){
        for(int i=0; i<cities.length; i++){
            if(cities[i].charAt(0)==c){
                s.add(cities[i]);
            }
        }
    }

    public String cities(){
        String wynik="";
        for(int i=0; i<s.size(); i++){
            wynik+=s.get(i);
        }
        return wynik;
    }

    public static void main(String[] args) {
        String[] arr={"Warszawa","Sopot","Kielce","Szczecin"};

        Cities c= new Cities(arr);

        c.filter('S');
        System.out.println(c.cities());
    }
}
