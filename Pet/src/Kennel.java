/**
 * Represents a kennel
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
import java.util.ArrayList;

public class Kennel {
    private ArrayList<Pet> petList; //the list of pets in the kennel

    /**
     * Constructs a new kennel with an empty pet list
     * (Postcondition: petList is initialized to an empty ArrayList)
     * (Precondition: petList is declared as an ArraList of pets)
     */
    public Kennel() {
        this.petList = new ArrayList<>();
    }

    /**
     * Adds a pet to the kennel
     * (Postcondition: pet is added to the kennel)
     * @param pet the pet to add
     * (Precondition: pet is not null)
     */
    public void addPet(Pet pet) {
        this.petList.add(pet);
    }

    /**
     * Lists the results of all the pets speaking
     * (Postcondition: each pet's name and sound are printed)
     * (Precondition: no pets are null in petList)
     */
    public void allSpeak() {
        for(Pet p: petList) {
            System.out.format("%s: %s\n", p.getName(), p.speak());
        }
    }
}
