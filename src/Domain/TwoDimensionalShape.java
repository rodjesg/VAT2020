package Domain;

public class TwoDimensionalShape implements Shapes{
    private double surface;
    private double perimeter;
    private String name;

    public TwoDimensionalShape(String name) {
        this.name = name;
    }

    public double getSurface(){
        return surface;
    }

    public double getPerimeter(){
        return perimeter;
    }

    @Override
    public String getNameOfShape() {
        return null;
    }

    @Override
    public String toString() {
        return "This " + name + " has a surface of " + getSurface() + " cm2\n" +
                "and a perimeter of " + getPerimeter() + " cm";
    }
}
