package trianglesfromnotes;
/*
 * Programmer: Damian Zylski
 * Project:    TrianglesFromNotes
 * Date:       03/09/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To print out a series of triangles based on the powerpoint from
 * class. These are based from the notes on slide 19. I don't think there is any
 * way to align exactly like in the powerpoint
 */
public class TrianglesFromNotes
{
//*triangle1***************************************************************************
//Prints the first triangle
    public static int triangle1(int i)
    {
        //Variables
        int j = 0;

        //print problem number
        if(i == 0)
        {
            System.out.println("1)");
                       
            return triangle1(i = i + 1);
        }
        
        //Basecase
        //prints the dots
        else if(i == 5)
        {
            //increment i
            i++;
            
            //loop and print
            for(j=0; j < i; j++)
            {
                System.out.print(".");
            }
            
            //new line
            System.out.println("");
            
            return 0;
        }
        //loop and print the triangles
        else
        {
            //loop and print
            for(j=0; j < i; j++)
            {
                System.out.print("*");
            }
            
            //new line
            System.out.println("");
            
            return triangle1(i = i + 1);
        }      
    }
    
//*triangle2*************************************************************************
//Prints the second triangle  
    public static void triangle2()
    {
        //Variables
        int i = 0;
        int j = 0;
        int spaces = 3;
        
        //print problem number
        System.out.println("2)");
        
        //loop and print the triangles
        for(i = 1; i <= 5; i = i + 1)
        {
            if(i == 5)
            {
                
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
//*triangle3*************************************************************************
//Prints the third triangle
    public static int triangle3(int i)
    {
        //Variables
        int j = 0;
        
        //Basecase
        
        if(i == 0)
        {   
            return 0;
        }
        //prints the dots
        else if(i == 5)
        {
            //print problem number
            System.out.println("3)");
            
            //loop and print
            for(j=0; j < i; j++)
            {
                System.out.print(".");
            }
            
            //new line
            System.out.println("");
            
            return triangle3(i = i - 1);
        }
        //loop and print the triangles
        else
        {
            //loop and print
            for(j=0; j < i; j++)
            {
                System.out.print("*");
            }
            
            //new line
            System.out.println("");
            
            return triangle3(i = i - 1);
        }      
    }

//*main*************************************************************************
    public static void main(String[] args)
    {
        //print the first triangle
        triangle1(0);
        
        //print the second triangle
        triangle2();
        
        //print the third triangle
        triangle3(5);
    }  
}
