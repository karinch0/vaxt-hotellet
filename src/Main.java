import dialog.InitialMenu;
import plants.Plant;

void main() {
    var plants = new ArrayList<Plant>();
    Scanner scanner = new Scanner(System.in);

    TestData.testData(plants);

    InitialMenu.initialMenu(plants, scanner);

}
