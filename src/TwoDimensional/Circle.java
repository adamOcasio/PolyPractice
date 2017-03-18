package TwoDimensional; /**
 * Created by Adam Ocasio on 3/17/2017.
 */
import TwoDimensional.TwoDimensionalShape;

public class Circle extends TwoDimensionalShape
{
    private double radius;

    public Circle(String classification, double radius)
    {
        super(classification);

        if(radius < 0.0)
            throw new IllegalArgumentException
                    ("Radius must be > 0.0");

        this.radius = radius;
    }

    //set radius
    public void setRadius()
    {
        if (radius < 0.0)
            throw new IllegalArgumentException
                    ("Radius must be > 0.0");
    }

    //get radius
    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f%n%n",
                "Classification", getClassification(),
                "area of shape is", getArea());
    }
}
