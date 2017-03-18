package TwoDimensional;

import TwoDimensional.TwoDimensionalShape;

/**
 * Created by Adam Ocasio on 3/17/2017.
 */
public class Triangle extends TwoDimensionalShape
{
    private double base;
    private double height;

    public Triangle(String classification, double base, double height)
    {
        super(classification);

        if(base < 0.0)
            throw new IllegalArgumentException
                    ("base must be > 0.0");

        if (height < 0.0)
            throw new IllegalArgumentException
                    ("height must be > 0.0");

        this.base = base;
        this.height = height;
    }

    //set base
    public void setBase()
    {
        if (base < 0.0)
            throw new IllegalArgumentException
                    ("base must be > 0.0");
        this.base = base;
    }

    //get base
    public double getBase()
    {
        return base;
    }

    //set height
    public void setHeight()
    {
        if(height < 0.0)
            throw new IllegalArgumentException
                    ("height must be > 0.0");

        this.height = height;
    }

    //get height
    public double getHeight()
    {
        return height;
    }

    @Override
    public double getArea()
    {
        return (getBase() * getHeight()) / 2;
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f%n%n",
                "Name of shape is", getClassification(),
                "Area of shape is", getArea());
    }
}