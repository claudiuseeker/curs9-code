package ro.fasttrackit.curs9.homework2.exercise1;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product();
        Cosmetics cosmetics = new Cosmetics();
        Product electronics = new Electronics();
        Fridge fridge = new Fridge(12);

        cosmetics.description = "de dat pe fata";
        System.out.println(cosmetics);
        cosmetics.name = "Crema";

        cosmetics.addProducts(15);

        cosmetics.increasePrice(20);
        System.out.println(cosmetics);
        cosmetics.increasePrice(20);
        System.out.println(cosmetics);
        cosmetics.addProducts(15);
        System.out.println(cosmetics);
        cosmetics.setColor("blue");
        cosmetics.getColor();
        System.out.println(cosmetics.getColor());
        cosmetics.setWeight(12);
        cosmetics.getWeight();
        System.out.println(cosmetics.getWeight());

        System.out.println("----Electronis");

        fridge.description = "Frigider casnic";
        fridge.price = 300;
        fridge.name = "Frigider";
        fridge.quantity = 2;
        System.out.println(fridge);
        fridge.getTemperature();
        System.out.println(fridge.getTemperature());
        fridge.decreaseTemperature(3);
        System.out.println(fridge.getTemperature());
    }
}
