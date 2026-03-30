import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println("Bogie Type: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Bogie> bogieList = new ArrayList<>();

        System.out.println("===== Train Consist Management App =====");

        // Taking user input
        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Bogie " + (i + 1));

            System.out.print("Enter bogie name (Sleeper / AC Chair / First Class): ");
            String name = sc.nextLine();

            System.out.print("Enter seating capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine(); // consume newline

            bogieList.add(new Bogie(name, capacity));
        }

        // Sorting using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\n===== Sorted Bogies by Capacity =====");
        for (Bogie b : bogieList) {
            b.display();
        }

        sc.close();
    }
}