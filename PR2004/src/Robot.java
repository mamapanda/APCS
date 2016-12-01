import java.util.Arrays;

public class Robot {
    private int[] hall;
    private int pos;             // current position(tile number) of Robot
    private boolean facingRight; // true means this Robot is facing right

    public Robot(int[] hall, int pos, boolean facingRight) {
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
    }

    // postcondition: returns true if this Robot has a wall immediately in
    //                front of it, so that it cannot move forward;
    //                otherwise, returns false
    private boolean forwardMoveBlocked() {
        return (!facingRight && pos == 0) || (facingRight && pos == hall.length - 1);
    }

    // postcondition: one move has been made according to the
    //                specifications above and the state of this
    //                Robot has been updated
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

    // postcondition: no more items remain in the hallway;
    //                returns the number of moves made
    public int clearHall() {
        int moves = 0;
        while(!hallIsClear()) {
            move();
            moves++;
        }
        return moves;
    }

    // postcondition: returns true if the hallway contains no items;
    //                otherwise, returns false
    private boolean hallIsClear() {
        return Arrays.stream(hall).allMatch(b -> b == 0);
    }
} 
