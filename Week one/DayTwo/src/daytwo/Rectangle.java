package daytwo;
/**
 *
 * @author Damian Zylski
 * Rectangle class
 * 3/10/2021
 * class for rectangles
 */
public class Rectangle implements Shape
{
    //Attributes
    private Double length;
    private Double width;
    
    //constructors
    public Rectangle()
    {
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(Double l, Double w)
    {
        length = l;
        width = w;
    }
    
    //getters
    public Double getLength()
    {
        return length;
    }
    
    public Double getWidth()
    {
        return width;
    }
    
    //setters
    public void setLength(Double l)
    {
        length = l;
    }
    public void setWidth(Double w)
    {
        width = w;
    }
    
    //Calculate area
    @Override
    public Double calculateArea()
    {
        //Calc area
        Double area = length * width;
        
        return area;
    }
    
    //Display area
    @Override
    public void display()
    {
        System.out.println("Area of " + this.getName(this) + ": " + calculateArea());
    }
       
}
