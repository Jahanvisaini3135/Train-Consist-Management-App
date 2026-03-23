import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC5: Preserve Insertion Order of Bogies ===");

        // Create LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // User input
        System.out.print("\nEnter number of bogies to attach: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Adding bogies
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter bogie " + i + ": ");
            String bogie = scanner.nextLine();

            boolean added = trainFormation.add(bogie);

            if (added) {
                System.out.println(bogie + " attached successfully.");
            } else {
                System.out.println(bogie + " already exists! Duplicate ignored.");
            }
        }

        // Intentionally adding duplicate (example)
        System.out.println("\nAttempting to add duplicate bogie: Sleeper");
        trainFormation.add("Sleeper"); // ignored automatically

        // Display final formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}