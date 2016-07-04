package Common;

/**
 *
 * @author ujjal
 */
public class MazeGame {
    public static Maze createMaze() {
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door d1 = new Door(r1, r2);
        
        maze.AddRoom(r1);
        maze.AddRoom(r2);
        
        r1.SetSide(Direction.North, new Wall());
        r1.SetSide(Direction.East, d1);
        r1.SetSide(Direction.South, new Wall());
        r1.SetSide(Direction.West, new Wall());
        
        r2.SetSide(Direction.North, new Wall());
        r2.SetSide(Direction.East, new Wall());
        r2.SetSide(Direction.South, new Wall());
        r2.SetSide(Direction.West, d1);  
        
        return maze;
    }
}
