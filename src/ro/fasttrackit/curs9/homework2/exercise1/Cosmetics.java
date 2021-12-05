package ro.fasttrackit.curs9.homework2.exercise1;

public class Cosmetics extends Product{

    private String color;
    private int weight;

    public Cosmetics(){
        super();

        this.color = "Yellow";
        this.weight = 20;
    }
    public Cosmetics(int weight, String name, String description, String color){
        super(name, description);
        this.weight=weight;
        this.color=color;

    }

    public void addPoducts(){
        addProducts(5);
    }

    public void increasePrice(){
        increasePrice(10);
    }

   public String getColor(){
        return color;
    }
    public int getWeight(){
        return weight;
    }
    public void setColor(String palette){
        color = palette;
    }

    public void setWeight(int limits){
        if(limits>0 && limits<20){
            this.weight=limits;
        }
    }

}
