/**
 * Simulates a robot hall cleaner
 *
 * @author Daniel Phan
 * @version 12.1.16
 */

import java.util.Arrays;

public class Robot {
    private int[] hall; //the array of items in the hall
    private int pos; // the current position(tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right

    /**
     * Constructs a new robot with the given hall of items, position, and direction
     * (Postcondition: this.hall, this.pos, and this.facingRight are initialized)
     * @param hall the hall of items
     * @param pos the position of the robot in the hall
     * @param facingRight whether or not the robot is facing right
     * (Precondition: hall is not null, and pos is a valid index in hall)
     */
    public Robot(int[] hall, int pos, boolean facingRight) {
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
    }

    /**
     * Checks if the robot can move forward
     * (Postcondition: Returns whether or not the robot can move forward)
     * @return whether or not the robot can move forward
     * (Precondition: hall is not null)
     */
    private boolean forwardMoveBlocked() {
        return (!facingRight && pos == 0) || (facingRight && pos == hall.length - 1);
    }

    /**
     * Makes a move according to the rules
     * (Postcondition: one of the possible moves is made)
     * (Precondition: hall is not null, and pos is a valid index for hall)
     */
    private void move() {
        if(hall[pos] > 0) {
            hall[pos]--;
        }
        if(hall[pos] == 0) {
            if(forwardMoveBlocked()) {
                facingRight = !facingRight;
            }
            else {
                pos += facingRight ? 1: -1;
            }
        }
    }

    /**
     * Clears the hall, and returns the number of moves required to do so
     * (Postcondition: the hall is cleared, and the necessary move count is returned)
     * @return the number of moves necessary to clear the hall
     * (Precondition: hall is not null)
     */
    public int clearHall() {
        int moves = 0;
        while(!hallIsClear()) {
            move();
            moves++;
        }
        return moves;
    }

    /**
     * Checks if the hall is cleared
     * (Postcondition: returns whether or not the hall is cleared)
     * @return whether or not the hall is cleared
     * (Precondition: hall is not null)
     */
    private boolean hallIsClear() {
        return Arrays.stream(hall).allMatch(b -> b == 0);
    }
} 
