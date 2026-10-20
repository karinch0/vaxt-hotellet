package plants;

//enum
public enum PlantType {
    Cactus("Cactus"),
    CarnivorousPlant("Carnivorous Plant"),
    Palm("Palm");

    private final String displayName;

    PlantType(String name) {
        this.displayName = name;
    }

    public String getDisplayName() {
        return displayName;
    }
}
