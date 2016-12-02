/**
 * Simulates a cat
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class Cat extends Pet{
    /**
     * Constructs a new cat with the given name
     * (Postcondition: name is passed to Pet's constructor)
     * @param name the cat's name
     * (Precondition: name is not empty)
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Returns the string "meow"
     * (Postcondition: the string "meow" is returned)
     * @return the string "meow"
     * (Precondition: java.lang is imported)
     */
    @Override
    public String speak() {
        return "meow";
    }
}
