package Domain;

/**
 * @author Rodney
 */
public class Sphere extends ThreeDimensionalShape{

    public Sphere(String name) {
        super(name);
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getTotalSurface() {
        return 0;
    }
}
