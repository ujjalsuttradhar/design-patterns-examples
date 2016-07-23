package Builder;

import Common.Maze;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 15, 2016
 */
public class MazeGame {

    public static Maze createMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.BuildMaze();
        mazeBuilder.BuildRoom(1);
        mazeBuilder.BuildRoom(2);

        return mazeBuilder.GetMaze();
    }
}
