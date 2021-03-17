package singletonwork;

/**
 *
 * @author Zylski
 * Singleton class
 * The singleton class to fix
 * 3/14/21
 */
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

 public class Singleton //removed static for now
{

	private static Connection conn = null;
	
	volatile private static Singleton instance = null; //added volatile
	
	 public static Singleton getInstance() 
        {
            //This getInstance method had no locking. Added locking to make it a real Singleton
            if(instance == null)
            {
                //synchronized (instance)
                synchronized (Singleton.class) 
                {
                    if(instance == null)
                    {
                        instance = new Singleton();
                    }
                 }
            }
            return instance;
	}
	
	public static boolean databaseQuery(BigDecimal input) 
        {
            boolean connected = true;
            try
            {
                conn = DriverManager.getConnection("url of database"); //Added try catch for sql exception
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select id from table");
                int x = 0;
                while(rs.next()) 
                {
                    x = BigDecimal.valueOf(rs.getInt(1)).multiply(input).intValueExact(); //Had to make sure this can convert to int.                
                }
            }
            catch(SQLException | InputMismatchException | NumberFormatException e)
            {
                e.printStackTrace();
                connected = false;
            }
            return connected;
	}
}

