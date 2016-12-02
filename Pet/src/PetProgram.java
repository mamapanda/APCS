/**
 * Tests the Kennel class
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class PetProgram {
    public static void main(String[] args) {
        Kennel kennel = new Kennel();
        kennel.addPet(new Dog("RRRRR"));
        kennel.addPet(new Cat("JJJJJ"));
        kennel.addPet(new LoudDog("LLLLL"));
        kennel.allSpeak();
    }
}
