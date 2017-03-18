package ThreeDimensional;

import Shapes.Shape;

/**
 * Created by Adam Ocasio on 3/17/2017.
 */
public abstract class ThreeDimensionalShape extends Shape
{
    public ThreeDimensionalShape(String classification)
    {
        super(classification);
    }

    public abstract double getVolume();
}
