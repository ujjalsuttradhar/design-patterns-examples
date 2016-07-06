package AbstractFactory;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 6, 2016
 */
public class AbstractFactoryCreator {
   
    public static MazeFactory createFactory(String factoryName) {
        
        switch(factoryName) {
            case "Enchanted" : return new EnchantedMazeFactory(); 
            default: return new MazeFactory(); 
        }
    }
}
