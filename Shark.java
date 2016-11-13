/**
 * Created by unike on 12.11.2016.
 */
public class Shark extends Fish {
    int sizeOfShark;

    public Shark() {

    }

    public Shark(int sizeOfShark, String type, String eats, boolean vegetarian) {
        this.sizeOfShark = sizeOfShark;
        this.type = type;
        this.eats = eats;
        this.vegetarian = vegetarian;
    }

    String getSharkProperties() {
        return "Size = " + sizeOfShark + " , type = " + type + " , eats " + eats + " , vegetarian = " + vegetarian;
    }
}
