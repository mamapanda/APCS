import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList<String> waitList;

    public Hotel() {
        rooms = new Reservation[100];
        waitList = new ArrayList<>();
    }
    public Reservation requestRoom(String guestName) {
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }
    public Reservation cancelAndReassign(Reservation res) {
        int rNum = res.getRoomNumber();
        if(waitList.size() > 0) {
            rooms[rNum] = new Reservation(waitList.get(0), rNum);
            waitList.remove(0);
        }
        else {
            rooms[rNum] = null;
        }
        return rooms[rNum];
    }
}
