package daytwo;
/*
 * Programmer: Damian Zylski
 * Project:    TrianglesFromNotes
 * Date:       03/10/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To let user enter various input and try adding it up, to find the 
 * highest position in a two dimensional array, and to create a shape class 
 * hierarchy.
 */

import java.text.DecimalFormat;

public class DayTwo
{
//*varArgAdd***************************************************************************** 
    //gets input from command line and tries to add it
    public static void varArgAdd(String [] args)
    {
        //variables
        Double sum = 0.0;
        Double num = 0.0;
        int n = args.length;
        DecimalFormat df = new DecimalFormat("##.00");
        StringBuilder s = new StringBuilder(""); 
                
        //loop through the args and try to add them
        //I don't think I can use Stringbuilder with a foreach loop, so I will
        //use String. Let me know if there's a way. Or should I use regular loop?
        for(String str : args) 
        {
            try
            {
                num = Double.parseDouble(str);
            }
            catch(NumberFormatException e)
            {
                e.printStackTrace();
                System.out.println("Cannot add value " + str + ". Invalid Input!");
                continue;
            }
            
            //add the number to the sum
            sum = sum + num;
        }
        
        //output result
        System.out.println("Sum of arguments: " + df.format(sum));
    }
    
//*findArrayMax***************************************************************************** 
    //Tries to find the largest point in a 2D array
    
//*shapes*****************************************************************************  
    //Creates various shape objects and displays their areas
    
//*main*****************************************************************************    
    public static void main(String[] args)
    {
        //get input from command line and add it
       varArgAdd(args);
    }   
}
