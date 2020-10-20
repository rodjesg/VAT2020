package Domain;

/**
 * @author Rodney
 */
public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(String name) {
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
