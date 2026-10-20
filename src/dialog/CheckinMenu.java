package dialog;

import plants.*;

import java.util.ArrayList;
import java.util.Scanner;

// Interface implementation
public class CheckinMenu implements InputHelper{

    public static void checkinMenu(ArrayList<Plant> plants, Scanner scanner, String plantName){
        double height;
        int typeChoice;
        System.out.println("===Check-in Menu===");

        plantName = InputHelper.gettingNameLoop(plantName, scanner);

        height = heightInput(scanner);

        System.out.println("Please choose a type of plant: ");
        for (int i = 0, k = 1; i < PlantType.values().length; i++, k++) {
            System.out.println(k + ". " + PlantType.values()[i]);
        }

        PlantType plant = PlantType.values()[indexTypeInput(scanner)];

        System.out.println("Do you want to check-in " + plant +
                plantName + " with " + height + " m height?");
        System.out.println("Press Enter to check-in");
        System.out.print("Press 1 to change information: ");
        System.out.print("Press 0 to go to main menu: ");

        switch (scanner.nextLine()) {
            case "" -> checkInPlant(plant, plantName, height, plants);
            case "0" ->System.out.println("Wrong input. Nothing is here");
            case "1" -> System.out.println("Wrong input. I didnt it");
            default -> System.out.println("Wrong input. Totally wrong");
        }

    }

    private static void checkInPlant(PlantType plant, String plantName, double height, ArrayList<Plant> plants) {
        switch (plant) {
            case Palm -> plants.add(new Palm(height, plantName));
            case Cactus -> plants.add(new Cactus(height, plantName));
            case CarnivorousPlant -> plants.add(new CarnivorousPlant(height, plantName));
        }
    }

    static int indexTypeInput(Scanner scanner){
        while(true){
            try {
                int typeChoice = Integer.parseInt(scanner.nextLine());

                if(typeChoice <= 0 || typeChoice > PlantType.values().length){
                    System.out.print("Please enter value from 1 to " + PlantType.values().length + ": ");
                    continue;
                }
                typeChoice--;
                return typeChoice;

            } catch(NumberFormatException e){
                System.out.print("Please enter value from 1 to " + PlantType.values().length + ": ");
            }
        }
    }

    static double heightInput(Scanner scanner) {
        System.out.print("Please enter plants height: ");

        while (true) {
            try {
                double input = Double.parseDouble(scanner.nextLine());

                if (input > 0) return input;

                System.out.print("Please enter plants height which is more than 0: ");
            } catch (NumberFormatException e) {
                System.out.print("Please enter valid plants height: ");
            }
        }

    }
}
