/**
 * Represents a loud dog
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class LoudDog extends Dog {
    /**
     * Constructs a LoudDog with the given name
     * (Postconditon: name is passed to Dog's constructor)
     *
     * @param name the LoudDog's name
     *             (Precondition: name is not empty)
     */
    public LoudDog(String name) {
        super(name);
    }

    /**
     * Returns the string "dog-sound dog-sound"
     * (Postcondition: the string "dog-sound dog-sound" is returned)
     *
     * @return the string "dog-sound dog-sound"
     * (Precondition: java.lang is imported)
     */
    @Override
    public String speak() {
        return String.format("%s %s", super.speak(), super.speak());
    }
}
