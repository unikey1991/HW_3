/**
 * Created by unike on 12.11.2016.
 */
public class Cow extends Mammal {
    boolean hoof = true;
    boolean givesMilk;

    public Cow() {

    }

    public Cow(int noOfLegs, String eats, boolean vegetarian, boolean givesMilk) {
        this.noOfLegs = noOfLegs;
        this.eats = eats;
        this.vegetarian = vegetarian;
        this.givesMilk = givesMilk;
    }

    String getCowProperties() {
        return "hoof = " + hoof + " , gives milk = " + givesMilk + " number of legs = " + noOfLegs + " , eats = " + eats + " , vegetarian = " + vegetarian;
    }
}
