package dialog;

import plants.Plant;

import java.util.Scanner;
import java.util.ArrayList;

// Interface implementation
public class FeedingMenu implements InputHelper{

    public FeedingMenu(ArrayList<Plant> plants, Scanner scanner) {
    }

    public static void feedingMenu(ArrayList<Plant> plants, Scanner scanner) {
        System.out.print("===Greenes===\nOur guests:\n");
        String emptyInputMessage = "Please choose who do you want to feed: ";
        boolean isFeedingMenu = true;

        while (isFeedingMenu) {
            feedingMenuDisplay(plants);
            String choice = scanner.nextLine();

            choice = InputHelper.gettingNameLoop(choice, scanner);


            if (!plantFeeder(choice, plants)) {
                System.out.println(choice + " doesn't live here. Would you like to check-in " + choice + "?");
                System.out.print("Press Enter to check in " + choice + ". Press anything to continue feeding.");
                if (InputHelper.isInputEmpty(scanner)) {
                   CheckinMenu.checkinMenu(plants, scanner, choice);
                    isFeedingMenu = false;
                    }
                }

        }
    }

    private static void feedingMenuDisplay(ArrayList<Plant> plants) {
        String feedingQuestion = "Who do you want to feed?";

        for (Plant plant : plants) {
            System.out.println(plant.getName());
        }
        System.out.println(feedingQuestion);

    }

    static private boolean plantFeeder(String choice, ArrayList<Plant> plants) {
        for (Plant plant : plants) {
            if (choice.equals(plant.getName())) {
                double liquidAmount = plant.feeding();
                System.out.println("Plant " + plant.getName() + " needs drink " +
                        liquidAmount + " l of " + plant.getLiquidType());
                return true;
            }
        }
        return false;
    }

}
