package ro.fasttrackit.curs9.homework2.exercise1;

public class Product {

    protected int price;
    protected String name;
    protected String description;
    protected int quantity;

    public Product(){
        this("Products","products");
    }
    public Product( String name, String description) {
        this.price = 0;
        this.name = " ";
        this.description = " ";
        this.quantity = 0;
    }

    public void addProducts(int increment){

        this.quantity += increment;
    }

    public void increasePrice(int increase){
        this.price += increase;
    }
    public String toString() {
        return "price: " + price + ";" + "name: " + name + ";" + "description: " + description + ";" + "quantity: " + quantity;
    }

}
