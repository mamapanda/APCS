/**
 * Test the Robot class
 *
 * @author Daniel Phan
 * @version 12.1.16
 */
public class RobotProgram {
    public static void main(String[] args) {
        int[] hall = {
            1, 1, 2, 2
        };
        int pos = 1;
        boolean facingRight = false;
        System.out.format("Moves: %d", new Robot(hall, pos, facingRight).clearHall());
    }
}
