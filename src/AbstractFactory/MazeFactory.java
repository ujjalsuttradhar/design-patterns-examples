package AbstractFactory;

import Common.Door;
import Common.Maze;
import Common.Room;
import Common.Wall;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 5, 2016
 */
public class MazeFactory {

    public MazeFactory() {
        
    }
    
    Maze MakeMaze() {
        return new Maze();
    }
    
    Wall MakeWall() {
        return new Wall();
    }
    
    Room MakeRoom(int n) {
        return new Room(n);
    }
    
    Door MakeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
