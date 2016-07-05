package AbstractFactory;

import Common.Direction;
import Common.Door;
import Common.Log;
import Common.Maze;
import Common.Room;
import Common.Wall;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 4, 2016
 */

class MazeGame {
    public static Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.MakeMaze();
        Room r1 = mazeFactory.MakeRoom(1);
        Room r2 = mazeFactory.MakeRoom(2);
        Door d1 = mazeFactory.MakeDoor(r1, r2);
        
        maze.AddRoom(r1);
        maze.AddRoom(r2);
        
        r1.SetSide(Direction.North, mazeFactory.MakeWall());
        r1.SetSide(Direction.East, d1);
        r1.SetSide(Direction.South, mazeFactory.MakeWall());
        r1.SetSide(Direction.West, mazeFactory.MakeWall());
        
        r2.SetSide(Direction.North, mazeFactory.MakeWall());
        r2.SetSide(Direction.East, mazeFactory.MakeWall());
        r2.SetSide(Direction.South, mazeFactory.MakeWall());
        r2.SetSide(Direction.West, d1);  
        
        return maze;
    }
}
public class AbstractFactoryMain {
    public static void main(){
        MazeFactory factory = new EnchantedMazeFactory();
        // Or, MazeFactory factory = new MazeFactory();
        MazeGame.createMaze(factory);
    }
}
