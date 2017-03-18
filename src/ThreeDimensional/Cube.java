package ThreeDimensional; /**
 * Created by Adam Ocasio on 3/17/2017.
 */
import ThreeDimensional.ThreeDimensionalShape;

import java.lang.Math;

public class Cube extends ThreeDimensionalShape
{
    private double edge;

    public Cube(String classification, double edge)
    {
        super(classification);

        if (edge < 0.0)
            throw new IllegalArgumentException
                    ("ThreeDimensional.Cube edges must be > 0.0");

        this.edge = edge;
    }

    //set edge
    public void setEdge()
    {
        if(edge < 0.0)
            throw new IllegalArgumentException
                    ("ThreeDimensional.Cube edges must be > 0.0");

        this.edge = edge;
    }

    //get edge
    public double getEdge()
    {
        return edge;
    }

    @Override
    public double getArea()
    {
        return 6 * Math.pow(edge, 2);
    }

    @Override
    public double getVolume()
    {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f%n%s%.2f%n%n",
                "Shapes.Shape classification", getClassification(),
                "Area of cube", getArea(),
                "Volume of cube", getVolume());
    }
}
