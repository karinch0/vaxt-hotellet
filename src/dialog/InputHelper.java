package dialog;


import java.util.Scanner;

//interface
public interface InputHelper {

    //data double <=0
    static boolean isInputEmpty(Scanner scanner){
        String input = scanner.nextLine();
        return input.isBlank();
    }

     static String gettingNameLoop(String plantName, Scanner scanner){
        while (true) {
            if (plantName.isBlank()) {
                System.out.print("Please enter plants name: ");
                plantName =  scanner.nextLine();
            } else {
                return plantName;
            }

        }
    }

    //static boolean isPlantExist();
}
