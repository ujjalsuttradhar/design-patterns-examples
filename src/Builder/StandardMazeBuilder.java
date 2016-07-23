package Builder;

import Common.Door;
import Common.Enums.Direction;
import Common.Maze;
import Common.Room;
import Common.Wall;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 18, 2016
 */
public class StandardMazeBuilder extends MazeBuilder {

    private Maze _currentMaze;

    private Direction CommonWall(Room r1, Room r2) {
        // Returns the direction of wall
        return Direction.East;
    }

    protected StandardMazeBuilder() {
        _currentMaze = null;
    }

    @Override
    public void BuildMaze() {
        _currentMaze = new Maze();
    }

    ;
    
    @Override
    public void BuildRoom(int n) {
        if (_currentMaze.RoomNo(n) != null) {
            Room room = new Room(n);
            _currentMaze.AddRoom(room);

            room.SetSide(Direction.North, new Wall());
            room.SetSide(Direction.South, new Wall());
            room.SetSide(Direction.East, new Wall());
            room.SetSide(Direction.West, new Wall());
        }
    }

    @Override
    public void BuildDoor(int n1, int n2) {
        Room r1 = _currentMaze.RoomNo(n1);
        Room r2 = _currentMaze.RoomNo(n2);
        Door d = new Door(r1, r2);

        r1.SetSide((CommonWall(r1, r2)), d);
        r2.SetSide((CommonWall(r1, r2)), d);
    }

    @Override
    public Maze GetMaze() {
        return _currentMaze;
    }
}
