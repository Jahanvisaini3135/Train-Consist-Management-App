import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Management App ===");
        System.out.println("=== UC6: Map Bogie to Capacity ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // User input
        System.out.print("\nEnter number of bogies: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Insert bogie-capacity pairs
        for (int i = 1; i <= n; i++) {
            System.out.print("\nEnter bogie name: ");
            String bogie = scanner.nextLine();

            System.out.print("Enter capacity for " + bogie + ": ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            bogieCapacityMap.put(bogie, capacity);
        }

        // Display all bogie-capacity mappings
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram continues...");

        scanner.close();
    }
}