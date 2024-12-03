abstract class Food {
    float prize;
    private String name;

    public Food(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public float getPrize() {
        return prize;
    }

    public abstract void setPrize(float prize);
    public abstract void setPrize();
    
}
