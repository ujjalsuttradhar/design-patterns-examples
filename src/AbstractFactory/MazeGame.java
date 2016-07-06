package AbstractFactory;

import Common.Enums;
import Common.Door;
import Common.Maze;
import Common.Room;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 6, 2016
 */

public class MazeGame {
    public static Maze createMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.MakeMaze();
        Room r1 = mazeFactory.MakeRoom(1);
        Room r2 = mazeFactory.MakeRoom(2);
        Door d1 = mazeFactory.MakeDoor(r1, r2);
        
        maze.AddRoom(r1);
        maze.AddRoom(r2);
        
        r1.SetSide(Enums.Direction.North, mazeFactory.MakeWall());
        r1.SetSide(Enums.Direction.East, d1);
        r1.SetSide(Enums.Direction.South, mazeFactory.MakeWall());
        r1.SetSide(Enums.Direction.West, mazeFactory.MakeWall());
        
        r2.SetSide(Enums.Direction.North, mazeFactory.MakeWall());
        r2.SetSide(Enums.Direction.East, mazeFactory.MakeWall());
        r2.SetSide(Enums.Direction.South, mazeFactory.MakeWall());
        r2.SetSide(Enums.Direction.West, d1);  
        
        return maze;
    }
}