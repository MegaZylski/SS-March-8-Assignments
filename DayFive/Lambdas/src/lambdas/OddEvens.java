package lambdas;

import java.util.List;

/**
 *
 * @author Zylski
 * OddEvens interface
 * 3/14/21
 */
public interface OddEvens
{
    //numbers method
    public void numbers(List nums);
    
    //is even method, checks for even num
    public static String isEvenorOdd(Integer i)
    {
        if(i % 2 == 0)
        {
            return "e" + i;
        }
        else
        {
            return "o" + i;
        }
    }
}
