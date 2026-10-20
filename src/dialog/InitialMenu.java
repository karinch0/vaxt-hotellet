package dialog;

import plants.Plant;

import java.util.Scanner;
import java.util.ArrayList;


public class InitialMenu{
    public static void initialMenu(ArrayList<Plant> plants, Scanner scanner) {
        String choice;

        while(true) {
            printMenu();
            choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    FeedingMenu.feedingMenu(plants, scanner);
                }
                case "2" -> CheckinMenu.checkinMenu(plants, scanner, "");
                case "3" -> CheckoutMenu.checkoutMenu(plants, scanner);
                case "4" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.print("Wrong choice. Try again.");
            }
        }
    }


    private static void printMenu() {
        final String MENU_TITLE = "===Welcome to Greenes!===\nMake your choice:\n";
        final String MENU_OPTIONS = "1 - Feed guests\n2 - Check-in guests\n3 - Check-out guests\n4 - Exit\n";
        final String MENU_ACTION_REQUEST = "---Enter a number of your choice---\n";

        System.out.print(MENU_TITLE + MENU_OPTIONS + MENU_ACTION_REQUEST);
    }
}
