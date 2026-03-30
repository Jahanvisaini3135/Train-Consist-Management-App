import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Bogie> bogieList = new ArrayList<>();

        // Step 1: User creates list of bogies
        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Enter bogie type (Sleeper/AC Chair/First Class): ");
            String type = sc.nextLine();

            System.out.print("Enter seating capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine(); // consume newline

            bogieList.add(new Bogie(type, capacity));
        }

        // Display original list
        System.out.println("\n--- Original Bogie List ---");
        for (Bogie b : bogieList) {
            System.out.println("Type: " + b.getType() + ", Capacity: " + b.getCapacity());
        }

        // Step 2: Stream grouping
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));

        // Step 3: Display grouped result
        System.out.println("\n--- Grouped Bogies by Type ---");

        if (groupedBogies.isEmpty()) {
            System.out.println("No bogies to group.");
        } else {
            for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
                System.out.println("\nBogie Type: " + entry.getKey());
                for (Bogie b : entry.getValue()) {
                    System.out.println("  Capacity: " + b.getCapacity());
                }
            }
        }

        // Step 4: Verify original list unchanged
        System.out.println("\n--- Original List After Grouping (Unchanged) ---");
        for (Bogie b : bogieList) {
            System.out.println("Type: " + b.getType() + ", Capacity: " + b.getCapacity());
        }

        sc.close();
    }
}