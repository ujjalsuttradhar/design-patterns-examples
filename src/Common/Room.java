/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

import java.util.ArrayList;

/**
 *
 * @author ujjal
 */
public class Room extends MapSite {
    private int roomNumber;
    private ArrayList<MapSite> sides = new ArrayList<MapSite>();
    
    public Room(int roomNo) {
        roomNumber = roomNo;
    }
    
    public MapSite GetSide(int direction) {
        return sides.get(direction);
    }
    
    public void SetSide(Direction direction, MapSite mapSite) {
        sides.set(direction.ordinal(), mapSite);
    }

    @Override
    void Enter() {
        
    }
}
