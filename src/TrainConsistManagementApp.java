import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Scanner for user input

        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Prompt user to start
        System.out.println("Press Enter to initialize the train consist...");
        scanner.nextLine();

        // Initialize empty list of bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist summary
        System.out.println("\nTrain consist initialized successfully!");

        // Display initial bogie count
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Program continues (placeholder for next use cases)
        System.out.println("\nSystem ready for further operations...");

        scanner.close();
    }
}