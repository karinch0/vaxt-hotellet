package plants;


// inheritance
public class Cactus extends Plant {
    // encapsulation
    private static final double LIQUID_NEED = 0.02;

    public Cactus(double height, String name) {
        super(height, name, LiquidType.MINERAL_WATER);
    }

    // polymorphism
    @Override
    public double feeding() {
        return LIQUID_NEED;
    }
}
