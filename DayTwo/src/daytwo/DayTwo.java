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
    public static Double varArgAdd(String [] args)
    {
        //variables
        Double sum = 0.0;
        Double num = 0.0;
        int n = args.length; //Might have needed this if we used regular for loop
        DecimalFormat df = new DecimalFormat("##.00");
        StringBuilder s = new StringBuilder(); //Don't need this since we are not altering strings
                
        //loop through the args and try to add them
        //Using a for each loop since it is easiest to use and best for memory
        //I read the str var is just a reference to what is in the array. And we
        //are not performing any operations on strings so we do not need StringBuilder
        //here. We are just reading directly from the args array.
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
        
        return sum;
    }
    
//*findArrayMax***************************************************************************** 
    //Tries to find the largest point in a 2D array
    public static String findArrayMax()
    {
        //variables
        Integer [] [] arr = new Integer [5][2];
        Integer rows = arr.length;
        Integer cols = arr[0].length;
                
        //initialize array
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = 0;
            }
        }
        
        //initialize biggest num indexes
        Integer biggest = arr[0][0];
        Integer rowMax = 0;
        Integer colMax = 0;
        
        //add some values
        arr[1][0] = 512;
        arr[3][1] = 2048;
        arr[4][1] = 1024;
        arr[0][1] = 256;
        
        //loop through the array and find the indexes of the biggest num
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] > biggest)
                {
                    //set new biggest if current index is bigger
                    biggest = arr[i][j];
                    rowMax = i;
                    colMax = j;
                }
            }
        }
        
        //output the index of the biggest value
        System.out.println("\nThe biggest value in the array is at " + rowMax +
                "," + colMax + "\n");
        
        //Might as well return the index as a string
        return "" + rowMax + "," + colMax;
    }
    
//*shapes*****************************************************************************  
    //Creates various shape objects and displays their areas
    public static void shapes()
    {
        //Create shapes
        Rectangle r = new Rectangle(10.0,5.0);
        Circle c = new Circle(10.0);
        Triangle t = new Triangle(10.0, 5.0);
        
        //Output areas
        r.display();
        c.display();
        t.display();
    }
    
//*main*****************************************************************************    
    public static void main(String[] args)
    {
        //get input from command line and add it
       varArgAdd(args);
       
       //create 2d array and find the largest value in it
       findArrayMax();
       
       //create various shapes, output areas
       shapes();
    }   
}
