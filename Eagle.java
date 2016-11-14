/**
 * Created by unike on 12.11.2016.
 */
public class Eagle extends Bird {
    int rangeOfFlight = 1000;
    boolean plumage = true;

    Eagle (int rangeOfFlight){
        super(false,"meat","Eagle");
        this.rangeOfFlight = rangeOfFlight;
    }

    Eagle(boolean vegetarian, String eats, boolean plumage){
        super (vegetarian,eats,"Eagle");
        this.eats = eats;
        this.vegetarian = vegetarian;
        this.plumage = plumage;
    }

    String getEagleProperties() {
        return "plumage = " + plumage + " , vegetarian = " + vegetarian + " , eats = " + eats + " , noOfLegs = " + noOfLegs + " , type = " + type;
    }
}
