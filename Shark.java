/**
 * Created by unike on 12.11.2016.
 */
public class Shark extends Fish {
    int sizeOfShark;


    public Shark(int sizeOfShark) {
        super("Shark",false,"Fish, meat, hoomans");
        this.sizeOfShark = sizeOfShark;
    }

    String getSharkProperties() {
        return "Size = " + sizeOfShark + " , type = " + type + " , eats " + eats + " , vegetarian = " + vegetarian;
    }

}
