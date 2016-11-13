/**
 * Created by unike on 12.11.2016.
 */
public class Eagle extends Bird {
    int rangeOfFlight;
    boolean plumage = true;

    public Eagle() {

    }

    public Eagle(int rangeOfFlight, boolean vegetarian, String eats, int noOfLegs, String type) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
        this.rangeOfFlight = rangeOfFlight;
        this.type = type;
    }

    String getEagleProperties() {
        return "plumage = " + plumage + " , vegetarian = " + vegetarian + " , eats = " + eats + " , noOfLegs = " + noOfLegs + " , type = " + type;
    }
}
