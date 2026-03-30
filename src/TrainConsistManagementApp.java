import java.util.*;

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
        return "Bogie Type: " + type + ", Capacity: " + capacity;
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
        System.out.println("\n--- Bogie List ---");
        bogieList.forEach(System.out::println);

        // Step 2: Stream pipeline (map + reduce)
        int totalSeats = bogieList.stream()
                .map(b -> b.getCapacity())     // Extract capacity
                .reduce(0, Integer::sum);      // Aggregate sum

        // Step 3: Display total capacity
        System.out.println("\n--- Total Seating Capacity ---");
        System.out.println("Total Seats in Train: " + totalSeats);

        // Step 4: Verify original list unchanged
        System.out.println("\n--- Original List After Aggregation (Unchanged) ---");
        bogieList.forEach(System.out::println);

        sc.close();
    }
}