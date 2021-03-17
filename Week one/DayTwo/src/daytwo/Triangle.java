package daytwo;
/**
 *
 * @author Damian Zylski
 * Triangle class
 * 3/10/2021
 * class for triangles
 */
public class Triangle implements Shape
{
    //Attributes
    private Double base;
    private Double height;
    
    //constructors
    public Triangle()
    {
        base = 0.0;
        height = 0.0;
    }
    public Triangle(Double b, Double h)
    {
        base = b;
        height = h;
    }
    
    //getters
    public Double getBase()
    {
        return base;
    }
    
    public Double getHeight()
    {
        return height;
    }
    
    //setters
    public void setBase(Double b)
    {
        base = b;
    }
    
    public void setHeight(Double h)
    {
        height = h;
    }
    
    //Calculate area
    @Override
    public Double calculateArea()
    {
        //Calc area
        Double area = 0.5 * base * height;
        
        return area;
    }
    
    //Display area
    @Override
    public void display()
    {
        System.out.println("Area of " + this.getName(this) + ": " + calculateArea());
    }
}
