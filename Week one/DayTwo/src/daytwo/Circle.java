package daytwo;
/**
 *
 * @author Damian Zylski
 * Circle class
 * 3/10/2021
 * The class for circles
 */

import java.lang.Math;

public class Circle implements Shape
{
    //Attributes
    private Double radius;
    
    //constructors
    public Circle()
    {
        radius = 0.0;
    }
    public Circle(Double r)
    {
        radius = r;
    }
    
    //getters
    public Double getRadius()
    {
        return radius;
    }
    
    //setters
    public void setRadius(Double r)
    {
        radius = r;
    }
    
    //Calculate area
    @Override
    public Double calculateArea()
    {
        //Calc area
        Double area = Shape.PI * Math.pow(radius,2.0);
        
        return area;
    }
    
    //Display area
    @Override
    public void display()
    {
        System.out.println("Area of " + this.getName(this) + ": " + calculateArea());
    }
       
}
