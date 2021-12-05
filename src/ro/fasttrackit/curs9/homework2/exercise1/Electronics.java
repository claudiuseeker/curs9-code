package ro.fasttrackit.curs9.homework2.exercise1;

public class Electronics extends Product{

    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    public Electronics(){
        super();

        this.type= "casnice";
        this.length=0;
        this.width = 0;
        this.height=0;
        this.weight=0;

    }

    public Electronics(String name, String description, String type, int lenght, int width, int height, int weight){
        super(name, description);
        this.type= type;
        this.length = lenght;
        this.width = width;
        this.height=height;
        this.weight=weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int limits) {
        if (limits > 0 && limits < 100) {
            this.weight = limits;
        }
    }
}
