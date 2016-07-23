package Builder;

import Common.Log;
import Common.Maze;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 18, 2016
 */
public class BuilderMain {

    public static void main() {
        Log.Verbose("Entered into BuilderMain.main()");

        StandardMazeBuilder builder = new StandardMazeBuilder();
        Maze createdMaze = MazeGame.createMaze(builder);

        if (createdMaze != null) {
            Log.Verbose("A new maze has been created");
        } else {
            Log.Verbose("Creation of new maze has been failed");
        }

        Log.Verbose("Exiting BuilderMain.main()");
    }

}
