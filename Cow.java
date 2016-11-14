/**
 * Created by unike on 12.11.2016.
 */
public class Cow extends Mammal {
    boolean hoof = true;
    boolean givesMilk;

    Cow(boolean givesMilk){
        super("Cow");
        this.givesMilk = givesMilk;
    }

    Cow(boolean givesMilk, String eats, int noOfLegs){
        super("Cow");
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.givesMilk = givesMilk;
    }


    String getCowProperties() {
        return "hoof = " + hoof + " , gives milk = " + givesMilk + " , number of legs = " + noOfLegs + " , eats = " + eats + " , vegetarian = " + vegetarian;
    }
}
