package Common;

/**
 *
 * @author ujjal
 */
public class Room extends MapSite {
    private int roomNumber;
    private MapSite[] sides;
    
    public Room(int roomNo) {
        roomNumber = roomNo;
        sides = new MapSite[4];
    }
    
    public MapSite GetSide(int direction) {
        return sides[direction];
    }
    
    public void SetSide(Enums.Direction direction, MapSite mapSite) {
        sides[direction.ordinal()] = mapSite;
    }

    @Override
    void Enter() {
        
    }
}
