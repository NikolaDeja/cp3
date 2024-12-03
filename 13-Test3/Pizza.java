public class Pizza extends Food implements Extra{
    Food f;
    int size;

    public Pizza(int size, String name, float prize){
        super(name);
        this.size=size;
    }

    public void setPrize() {
        prize=10;
    }

    public void setPrize(float a) {
        prize=a;
    }

    public float discount(){
        if(getPrize()>=30){
            setPrize(getPrize()-2);
        }
        return getPrize();
    }
    public float delivery(){
        if(prize>=50){
            return 8;
        }
        else{
            return 6;
        }
    }
    public float delivery(int a){
        if(prize>=50){
            return 8+a;
        }
        else{
            return 6+a;
        }
    }


}

