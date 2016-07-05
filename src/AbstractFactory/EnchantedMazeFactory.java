package AbstractFactory;

import Common.Door;
import Common.Room;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 6, 2016
 */
public class EnchantedMazeFactory extends MazeFactory {
    
    public EnchantedMazeFactory() {
        
    }
    
    Room MakeRoom(int n) {
        return new EnchantedRoom(n, true);
    }
    
    Door MakeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

}
