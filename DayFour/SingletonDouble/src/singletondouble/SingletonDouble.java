package singletondouble;
/*
 * Programmer: Damian Zylski
 * Project:    SingletonDemo
 * Date:       03/11/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To implement singleton with double lock checking
 */
public class SingletonDouble
{
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.getInstance();
        
        Singleton s2 = Singleton.getInstance();
        

    }
    
}
