package daytwo;

/**
 *
 * @author Zylski
 * Abstract shape class
 * 3/10/2021
 * An abstract class version of shape just for practice
 */
public abstract class ShapeAbs
{
    //constructor
    public ShapeAbs()
    {
        
    }
    
    //constants
    public static final Double PI = Math.PI; //to be used by circle or cyl type shapes
    
    //This is used to calculate the area for any shape classes
    public abstract double calculateArea();
    
    //This will display the area of any shape class
    public abstract void display();
    
    //a default method for printing shape name
    public String getName(Object o)
    {
        return o.getClass().getName();
    }
}
