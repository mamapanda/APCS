/**
 * Represents a loud dog
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class LoudDog extends Dog{
    public LoudDog(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return String.format("%s %s", super.speak(), super.speak());
    }
}
