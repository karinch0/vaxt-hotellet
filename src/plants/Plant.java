package plants;

public abstract class Plant {

    // encapsulation
    private final double height;
    private final String name;
    private final LiquidType liquidType;

    public Plant(double height, String name, LiquidType liquidType) {
        this.height = height;
        this.name = name;
        this.liquidType = liquidType;
    }

    public  String getName() {
        return name;
    }

    public  double getHeight() {
        return height;
    }

    public String getLiquidType(){
        return liquidType.getDisplayName();
    }
// polymorphism
    public abstract double feeding();
}
