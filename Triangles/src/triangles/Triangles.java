package triangles;
/*
 * Programmer: Damian Zylski
 * Project:    Triangles
 * Date:       03/08/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To print out a series of triangles based on the powerpoint from
 * class
 */
public class Triangles
{
//*triangle1***************************************************************************
//Prints the first triangle
    public static void triangle1()
    {
        //Variables
        int i = 0;
        int j = 0;
        
        //print problem number
        System.out.println("1)");
        
        //loop and print the triangles
        for(i = 0; i < 5; i++)
        {
            if(i == 4)
            {
                //Special case at the end, print dots
                i = (i * 2) + 1;
                //print the dots
                for(j = 0; j < i; j++)
                {
                    System.out.print(".");
                }
            }
            else
            {
                //print the stars
                for(j = 0; j < i + 1; j++)
                {
                    System.out.print("*");
                }
            }
            
            //new line
            System.out.println("");
        }
    }
//*triangle2*************************************************************************
//Prints the second triangle
    public static void triangle2()
    {
        //Variables
        int i = 0;
        int j = 0;
        
        //print problem number
        System.out.println("2)");
        
        //loop and print the triangles
        for(i = 10; i > 0; i--)
        {
            if(i == 10)
            {
                //Special case at the beginning, print dots
                //print the dots
                for(j = 0; j < i; j++)
                {
                    System.out.print(".");
                }
                
                //setup for star passes
                i = i / 2;
            }
            else
            {
                //print the stars
                for(j = 0; j < i; j++)
                {
                    System.out.print("*");
                }
            }
            
            //new line
            System.out.println("");
        }
    }
//*triangle3*************************************************************************
//Prints the third triangle  
    public static void triangle3()
    {
        //Variables
        int i = 0;
        int j = 0;
        int spaces = 5;
        
        //print problem number
        System.out.println("3)");
        
        //loop and print the triangles
        for(i = 1; i < 10; i = i + 2)
        {
            if(i == 9)
            {
                //Set correct number of dots
                i = i + 2;
                
                //Special case at the end, print dots
                //print the dots
                for(j = 0; j < i; j++)
                {
                    System.out.print(".");
                }
                
            }
            else
            {
                //print the stars, two cases, need some spaces and stars
                //first print spaces
                for(j = 0; j < spaces; j++)
                {
                    System.out.print(" ");
                }
                
                //then print stars
                for(j = 0; j < i; j++)
                {
                    System.out.print("*");
                }
            }
            
            //new line
            System.out.println("");
            //decrement spaces
            spaces--;
        }
    }
//*triangle4*************************************************************************
//Prints the fourth triangle    
    public static void triangle4()
    {
        //Variables
        int i = 0;
        int j = 0;
        int spaces = 1;
        
        //print problem number 
        System.out.println("4)|");
        
        //loop and print the triangles
        for(i = 11; i > 0; i = i - 2)
        {
            if(i == 11)
            {          
               //Special case at the beginning, print dots
                //print the dots
                for(j = 0; j < i; j++)
                {
                    System.out.print(".");
                }
                
                //decrement i to get correct stars
                i = i - 2;
                
            }
            else
            {
                //print the stars, two cases, need some spaces and stars
                //first print spaces
                for(j = 0; j < spaces; j++)
                {
                    System.out.print(" ");
                }
                
                //then print stars
                for(j = 0; j < i; j++)
                {
                    System.out.print("*");
                }
            }
            
            //new line
            System.out.println("");
            //increment spaces
            spaces++;
        }
    }
//*main*************************************************************************
    public static void main(String[] args)
    {
        //print the first triangle
        triangle1();
        
        //print the second triangle
        triangle2();
        
        //print the third triangle
        triangle3();
        
        //print the fourth triangle
        triangle4();
    }  
}
