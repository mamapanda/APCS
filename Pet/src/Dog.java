/**
 * Simulates a dog
 * 
 * @author Daniel Phan
 * @version 12.1.16
 */
public class Dog extends Pet {
    /**
     * Constructs a new dog with the given name
     * (Postcondition: name is passed into Pet's constructor)
     * @param name the dog's name
     * (Precondition: name is not empty)
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Returns the string "dog-sound"
     * (Postcondition: the string "dog-sound" is returned)
     * @return the string "dog-sound"
     * (Precondition: java.lang is imported)
     */
    @Override
    public String speak() {
        return "dog-sound";
    }
} 
