package Common;

import java.util.ArrayList;

/**
 *
 * @author ujjal
 */
public class Maze {
    
    private ArrayList<Room> rooms;
    
    public Maze() {
        rooms = new ArrayList<Room>();
    }
    
    public void AddRoom(Room room) {
        if(rooms != null) {
            rooms.add(room);
        }
    }
    
    public Room RoomNo(int roomNo) {
        return new Room(roomNo);
    }
}
