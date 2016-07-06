package AbstractFactory;

import Common.Log;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 4, 2016
 */

public class AbstractFactoryMain {
    public static void main(){
        Log.Verbose("Entered into AbstractFactoryMain.main()");
        
        MazeFactory factory = AbstractFactoryCreator.createFactory("Enchanted");
        //Or, MazeFactory factory = AbstractFactoryCreator.createFactory("Default");
        MazeGame.createMaze(factory);
    
        Log.Verbose("Exiting AbstractFactoryMain.main()");
    }
}
