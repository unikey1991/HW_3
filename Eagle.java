/**
 * Created by unike on 12.11.2016.
 */
public class Eagle extends Bird {
    int rangeOfFlight;
    boolean plumage = true;

    Eagle (int rangeOfFlight){
        super(false,"meat","Eagle");
        this.rangeOfFlight = rangeOfFlight;
    }

    String getEagleProperties() {
        return "plumage = " + plumage + " , vegetarian = " + vegetarian + " , eats = " + eats + " , noOfLegs = " + noOfLegs + " , type = " + type;
    }
}
