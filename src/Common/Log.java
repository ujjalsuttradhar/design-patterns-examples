package Common;

/**
 *
 * @author Ujjal Suttra Dhar <self@ujjal.net>
 * @date Jul 4, 2016
 */
public class Log {
    
   public static void Error(String msg) {
       System.err.printf("Error: %s\n", msg);
   }
   
   public static void Warn(String msg) {
       System.out.printf("Warning: %s\n", msg);
   }
   
   public static void Verbose(String msg) {
       System.out.printf("Verbose: %s\n", msg);
   }
}
