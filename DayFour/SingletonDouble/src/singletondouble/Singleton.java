package singletondouble;

/**
 *
 * @author Zylski
 * Singleton Class
 * 3/11/2021
 * Used to create instance of singleton
 */
public class Singleton
{
    //Setup a private instance of singleton
    volatile private static Singleton instance = null;
    
    //Private singleton constructor
    private Singleton()
    {
        
    }
    
    //Method to get instance
    public static Singleton getInstance()
    {
        //synchronized (instance)
        synchronized (Singleton.class) 
        {
            if(instance == null)
            {
                instance = new Singleton();
            }
         }
        
        return instance;
    }
    
}
