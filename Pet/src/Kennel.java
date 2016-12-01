/**
 * Represents a kennel
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList;
    public Kennel() {
        this.petList = new ArrayList<Pet>();
    }
    public void addPet(Pet pet) {
        this.petList.add(pet);
    }
    public void allSpeak() {
        for(Pet p: petList) {
            System.out.format("%s: %s\n", p.getName(), p.speak());
        }
    }
}
