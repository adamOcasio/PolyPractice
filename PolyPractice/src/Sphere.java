/**
 * Created by Adam Ocasio on 3/17/2017.
 */
import java.lang.Math;

public class Sphere extends ThreeDimensionalShape
{
    private double radius;

    public Sphere(String classification, double radius)
    {
        super(classification);

        if(radius < 0.0)
            throw new IllegalArgumentException
                    ("radius must be > 0.0");

        this.radius = radius;
    }

    //set radius
    public void setRadius()
    {
        if(radius < 0.0)
            throw new IllegalArgumentException
                    ("radius must be > 0.0");
        this.radius = radius;
    }

    //get radius
    public double getRadius()
    {
        return radius;
    }

    @Override
    public double getArea()
    {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume()
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f%n%n",
                "Classification is", getClassification(),
                "Area is", getArea(),
                "Volume is", getVolume());
    }
}
