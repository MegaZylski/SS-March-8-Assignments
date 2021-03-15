package lambdas;

/**
 *
 * @author Zylski
 * SortString Interface
 * 3/13/2021
 */
@FunctionalInterface
public interface SortStrings
{
    //sort method
    public void sort(String s1, String s2);
    
    //start with e static method
    public static Integer startWithE(String s1, String s2)
    {
        if(s1.charAt(0) == 'e' && s2.charAt(0) != 'e')
        {
            return -1; 
        }
        else
        {
            return 0;
        }
    }
}


