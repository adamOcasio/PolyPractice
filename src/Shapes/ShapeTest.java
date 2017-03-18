package Shapes;

import Shapes.Shape;
import ThreeDimensional.Cube;
import ThreeDimensional.Sphere;
import ThreeDimensional.Tetrahedron;
import TwoDimensional.Circle;
import TwoDimensional.Square;
import TwoDimensional.Triangle;
import TwoDimensional.TwoDimensionalShape;

/**
 * Created by Adam Ocasio on 3/17/2017.
 */
public class ShapeTest
{
    public static void main(String[]args)
    {
        Shape square = new Square("Square", 10, 10);
        Shape triangle = new Triangle("Triangle", 10, 5);
        Shape sphere = new Sphere("Sphere", 7);
        Shape circle = new Circle("Circle", 7);
        Shape cube = new Cube("Cube", 5);
        Shape tetrahedron = new Tetrahedron("Tetrahedron", 10);

        //create 6 element shape array
        Shape[] shapes = new Shape[6];

        //initialize the array with all the different shapes
        shapes[0] = square;
        shapes[1] = circle;
        shapes[2] = triangle;
        shapes[3] = cube;
        shapes[4] = tetrahedron;
        shapes[5] = sphere;

        for (Shape currentShape : shapes)
        {
            //determine whether the shape is two or three dimensional
            if (currentShape instanceof TwoDimensionalShape)
                System.out.println("This is a two-dimensional shape");
            else System.out.println("This is a three-dimensional shape");

            System.out.println(currentShape); //invokes toString
        }
    }
}
