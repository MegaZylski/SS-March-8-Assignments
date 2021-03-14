package recursion;
/*
 * Programmer: Damian Zylski
 * Project:    Recursion
 * Date:       03/13/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To code the recursive solution to find if a list of ints can equal
 * to a target number by adding the ints up. But if 2 ints are adjacent in the list
 * then they must either be all added together or not added at all.
 */
public class Recursion
{
    
//*groupSumClump*****************************************************************************
    //The recursive solution to finding if a list of nums can equal a target num based on the 
    //above mentioned conditions
    public static boolean groupSumClump(int index, int arr [], int target)
    {
        
        return false;
    }

//*main*****************************************************************************
    public static void main(String[] args)
    {
        //Create array
        int arr [] = {2,4,8};
        
        //run recursive solution
        System.out.println(groupSumClump(0, arr, 10));
    }
    
}
