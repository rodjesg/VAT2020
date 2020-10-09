package Domain;

/**
 * @author Rodney
 */
public class Square extends TwoDimensionalShape {
    private double length;
    private double width;

    public Square(double length, double width) {
        super("square");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSurface() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width)*2;
    }

    @Override
    public String getNameOfShape() {
        return super.getNameOfShape();
    }

    @Override
    public String toString() {
        return  "Length = " + length + " cm\n" +
                "Width = " + width + " cm\n" +
                super.toString();
    }
}
