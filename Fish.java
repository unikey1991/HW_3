/**
 * Created by unike on 12.11.2016.
 */
public class Fish extends Animal {
    String type;

    public Fish() {
    }

    public Fish(boolean vegetarian, String eats, String type) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = 0;
        this.type = type;
    }

}
