package plants;


// inheritance
public class CarnivorousPlant extends Plant {

    // encapsulation
    private static final double LIQUID_PER_METER = 0.2;
    private static final double BASE_LIQUID_NEED = 0.1;

    public CarnivorousPlant(double height, String name) {
        super(height, name, LiquidType.PROTEIN_DRINK);
    }

    // polymorphism
    @Override
    public double feeding() {

        return LIQUID_PER_METER * getHeight() + BASE_LIQUID_NEED;
    }
}
