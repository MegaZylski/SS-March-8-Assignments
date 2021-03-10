package daytwo;

/**
 *
 * @author Damian Zylski
 * Shape Interface
 * 3/10/2021
 * The base for any shape classes
 */

import java.lang.Math;

public interface Shape
{
    //constants
    static final Double PI = Math.PI; //to be used by circle or cyl type shapes
    
    //This is used to calculate the area for any shape classes
    public double calculateArea();
    
    //This will display the area of any shape class
    public void display();
    
    //a default method for printing shape name
    default String getName(Object o)
    {
        return o.getClass().getName();
    }
}
