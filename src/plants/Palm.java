package plants;

// inheritance
public class Palm extends Plant {
    private static final double LIQUID_PER_METER = 0.5;

    public Palm(double height, String name) {
        super(height, name, LiquidType.TAP_WATER);
    }

    // polymorphism
    @Override
    public double feeding() {
        return LIQUID_PER_METER * getHeight();
    }
}
