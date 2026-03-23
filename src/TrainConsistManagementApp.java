import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC3: Track Unique Bogie IDs ===");

        // Create HashSet for bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // User input
        System.out.print("\nEnter number of bogie IDs to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Adding bogie IDs
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Bogie ID " + i + ": ");
            String id = scanner.nextLine();

            boolean added = bogieIds.add(id);

            if (added) {
                System.out.println(id + " added successfully.");
            } else {
                System.out.println(id + " is duplicate and was ignored.");
            }
        }

        // Display unique bogie IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}