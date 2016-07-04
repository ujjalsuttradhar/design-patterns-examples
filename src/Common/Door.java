/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author ujjal
 */
public class Door extends MapSite{

    private Room room1;
    private Room room2;
    private boolean isOpen;
    
    public Door(Room r1, Room r2) {
        room1 = r1;
        room2 = r2;
    }
    
    public Room OtherSideFrom(Room room) {
        return (room == room1) ? room2 : room1;
    }
    
    @Override
    void Enter() {
        
    }
    
}
