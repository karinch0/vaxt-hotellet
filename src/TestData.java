import plants.Cactus;
import plants.Plant;
import plants.Palm;
import plants.CarnivorousPlant;
import  java.util.ArrayList;

public class TestData {
    static void testData(ArrayList<Plant> plants) {

        plants.add(new Cactus(0.02, "Igge"));
        plants.add(new Palm(5, "Laura"));
        plants.add(new CarnivorousPlant(0.7, "Meatloaf"));
        plants.add(new Palm(1, "Olof"));

    }
}
