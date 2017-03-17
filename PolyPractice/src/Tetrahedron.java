/**
 * Created by Adam Ocasio on 3/17/2017.
 */
import java.lang.Math;

public class Tetrahedron extends ThreeDimensionalShape
{
    private double edge;

    public Tetrahedron(String classification, double edge)
    {
        super(classification);

        if(edge < 0.0)
            throw new IllegalArgumentException
                    ("Edges must be > 0.0");

        this.edge = edge;
    }

    //set edge
    public void setEdge()
    {
        if(edge < 0.0)
            throw new IllegalArgumentException
                    ("Edges must be > 0.0");

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
        return Math.abs(3) * Math.pow(edge, 2);
    }

    @Override
    public double getVolume()
    {
        return Math.pow(edge, 3) / (6 * Math.abs(2));
    }

    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: %.2f%n%s: %.2f%n%n",
                "Shape classification:", getClassification(),
                "Shape area", getArea(),
                "Shape volume", getVolume());
    }
}
