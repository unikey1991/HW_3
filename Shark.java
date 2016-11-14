/**
 * Created by unike on 12.11.2016.
 */
public class Shark extends Fish {
    int sizeOfShark = 2;


    Shark(int sizeOfShark) {
        super("Shark", false, "Fish, meat, hoomans");
        this.sizeOfShark = sizeOfShark;
    }

    Shark(int sizeOfShark, boolean vegetarian, String eats) {
        super("Shark", vegetarian, eats);
        this.sizeOfShark = sizeOfShark;
        this.eats = eats;
        this.vegetarian = vegetarian;
    }

    String getSharkProperties() {
        return "Size = " + sizeOfShark + " , type = " + type + " , eats " + eats + " , vegetarian = " + vegetarian;
    }

}
