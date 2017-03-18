package Shapes;

/**
 * Created by Adam Ocasio on 3/16/2017.
 */
public abstract class Shape
{
    private String classification;

    public Shape (String classification)
    {
        this.classification = classification;
    }

    //return classification
    public String getClassification()
    {
        return classification;
    }

    public abstract double getArea();
}
