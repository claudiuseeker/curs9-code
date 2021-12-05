package ro.fasttrackit.curs9.homework2.exercise1;

public class Fridge extends Electronics{

    private int temperature;

    public Fridge(int temperature){
        super();
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }


    public void decreaseTemperature(int decrease){
        this.temperature -= decrease;
    }
}
