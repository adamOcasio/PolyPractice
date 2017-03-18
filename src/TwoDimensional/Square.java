package TwoDimensional;

import TwoDimensional.TwoDimensionalShape;

/**
 * Created by Adam Ocasio on 3/17/2017.
 */
public class Square extends TwoDimensionalShape
{
    private double length;
    private double width;

    public Square(String classification, double length, double width)
    {
        super(classification);

        if(length < 0.0)
            throw new IllegalArgumentException
                    ("length must be greater than 0.0");

        if(width < 0.0)
            throw new IllegalArgumentException
                    ("width must be greater than 0.0");

        this.length = length;
        this.width = width;
    }

    //set length
    public void setLength()
    {
        if (length < 0.0)
            throw new IllegalArgumentException
                    ("length must be greater than 0.0");
        this.length = length;
    }

    //get length
    public double getLength()
    {
        return length;
    }

    //set width
    public void setWidth()
    {
        if(width < 0.0)
            throw new IllegalArgumentException
                    ("width must be greater than 0.0");
        this.width = width;
    }

    //get width
    public double getWidth()
    {
        return width;
    }

    @Override
    public double getArea()
    {
        return getLength()*getWidth();
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %n%s: %.2f%n",
                "Name of shape:", getClassification(),
                "Area of shape", getArea());
    }
}
