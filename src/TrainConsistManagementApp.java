import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Adding bogies (User Input)
        System.out.println("\nEnter Passenger Bogies to Add:");

        System.out.print("Enter first bogie type (Sleeper): ");
        String bogie1 = scanner.nextLine();
        passengerBogies.add(bogie1);

        System.out.print("Enter second bogie type (AC Chair): ");
        String bogie2 = scanner.nextLine();
        passengerBogies.add(bogie2);

        System.out.print("Enter third bogie type (First Class): ");
        String bogie3 = scanner.nextLine();
        passengerBogies.add(bogie3);

        // Display bogies after insertion
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        System.out.print("\nEnter a bogie to remove (example: AC Chair): ");
        String removeBogie = scanner.nextLine();

        if (passengerBogies.remove(removeBogie)) {
            System.out.println(removeBogie + " removed successfully.");
        } else {
            System.out.println(removeBogie + " not found.");
        }

        // Check existence
        System.out.print("\nEnter bogie to check existence (example: Sleeper): ");
        String checkBogie = scanner.nextLine();

        if (passengerBogies.contains(checkBogie)) {
            System.out.println(checkBogie + " exists in the train.");
        } else {
            System.out.println(checkBogie + " does NOT exist in the train.");
        }

        // Final list
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}