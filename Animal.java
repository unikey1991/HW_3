/**
 * Created by unike on 12.11.2016.
 */
public class Animal {
    boolean vegetarian;
    String eats;
    int noOfLegs;


    Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    String isVegetarian() {
        return "vegetarian = " + vegetarian;
    }

    String getEats() {
        return "eats = " + eats;
    }

    String getNoOfLegs() {
        return "noOfLegs = " + noOfLegs;
    }

}
