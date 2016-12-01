/**
 * Simulates a cat
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "meow";
    }
}
