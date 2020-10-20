package Domain;

/**
 * @author Rodney
 */
public abstract class ThreeDimensionalShape implements Shapes {


    public ThreeDimensionalShape(String name) {
    }

    public abstract double getVolume();

    public abstract double getTotalSurface();

    @Override
    public String getNameOfShape() {
        return null;
    }
}
